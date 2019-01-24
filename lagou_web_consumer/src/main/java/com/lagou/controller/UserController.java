package com.lagou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lagou.feign.Feign;
import com.lagou.pojo.User;
import com.lagou.vo.SysResult;

@RestController
public class UserController {

	@Autowired
	Feign feign;
	
	@RequestMapping("/user/check/{param}/{type}")
	public SysResult check(
		@PathVariable("param") String param,
		@PathVariable("type") Integer type) {
		
		return feign.check(param, type);
	}
	@RequestMapping("/user/register") 
	public SysResult register(User user) {
		System.out.println(user.getPassword());
		return feign.register(user);
	}

	@RequestMapping("/user/login") 
	public SysResult login(User user) {
		
		return feign.login(user);
	}
}
