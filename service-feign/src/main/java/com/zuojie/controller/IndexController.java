
package com.zuojie.controller;

import com.zuojie.service.FeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class IndexController {

	@Resource
	private FeignService feignService;

	@RequestMapping("/hi")
	public String hi(String name) {
		return feignService.hi(name);
	}
}
