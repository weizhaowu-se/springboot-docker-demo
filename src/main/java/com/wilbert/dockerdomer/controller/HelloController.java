package com.wilbert.dockerdomer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuweizhao
 * @version 创建时间：2020/4/19 4:12 PM
 */
@RestController
public class HelloController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello() {
		return "hello docker demo";
	}
}
