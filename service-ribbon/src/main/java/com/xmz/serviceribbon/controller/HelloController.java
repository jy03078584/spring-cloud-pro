package com.xmz.serviceribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xmz.serviceribbon.service.HelloService;

/**
 *
 * @description:
 *
 * @author: Xiang Mingzhe
 *
 * @date: 2019-02-21
 **/
@RestController
public class HelloController {
	private final HelloService helloService;

	@Autowired
	public HelloController(HelloService helloService) {
		this.helloService = helloService;
	}

	@GetMapping("/hi")
	public String hi(@RequestParam(value = "name") String name) {
		return helloService.hiService(name);
	}
}
