
package com.zuojie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {
	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "error")
	public String hi(String name) {
		System.out.println("嘿嘿");
		return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
	}
	public String error(String name){
		 return "参数为:"+name+",调用SERVICE-HI 失败啦!";
	}

}
