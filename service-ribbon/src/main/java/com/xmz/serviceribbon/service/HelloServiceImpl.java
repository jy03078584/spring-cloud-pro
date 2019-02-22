package com.xmz.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @description:
 *
 * @author: Xiang Mingzhe
 *
 * @date: 2019-02-21
 **/
@Service
public class HelloServiceImpl implements HelloService{
	@Autowired
	private RestTemplate restTemplate;
	@Override
	public String hiService(String name) {
		return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name, String.class);
	}
}
