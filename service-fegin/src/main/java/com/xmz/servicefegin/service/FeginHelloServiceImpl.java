package com.xmz.servicefegin.service;

import org.springframework.stereotype.Service;

/**
 *
 * @description:
 *
 * @author: Xiang Mingzhe
 *
 * @date: 2019-02-25
 **/
@Service
public class FeginHelloServiceImpl implements FeginHelloService{
	@Override
	public String hiService(String name) {
		return "call error!";
	}
}
