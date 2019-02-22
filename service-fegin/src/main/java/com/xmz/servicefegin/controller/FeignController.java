package com.xmz.servicefegin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xmz.servicefegin.service.FeginHelloService;

/**
 *
 * @description:
 *
 * @author: Xiang Mingzhe
 *
 * @date: 2019-02-22
 **/
@RestController
public class FeignController {
	@Autowired
	private FeginHelloService feginHelloService;

	@GetMapping("/hi")
	public String hiService(@RequestParam(value = "name") String name) {
		return feginHelloService.hiService(name);
	}

}
