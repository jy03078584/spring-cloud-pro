package com.xmz.servicefegin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @description:
 *
 * @author: Xiang Mingzhe
 *
 * @date: 2019-02-22
 **/
@FeignClient(value = "service-hi", fallback = FeginHelloServiceImpl.class) // 服务名:service-hi
public interface FeginHelloService {

	@GetMapping("/hi")
	String hiService(@RequestParam(value = "name") String name);
}
