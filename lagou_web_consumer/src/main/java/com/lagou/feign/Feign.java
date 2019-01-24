package com.lagou.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lagou.pojo.User;
import com.lagou.vo.SysResult;

@FeignClient("sso-provider")
public interface Feign {


	@RequestMapping("/user/check/{param}/{type}")
	public SysResult check(
			@PathVariable("param") String param,
			@PathVariable("type") Integer type) ;


	@RequestMapping("/user/register") 
	public SysResult register(User user);

	@RequestMapping("/user/login") 
	public SysResult login(User user);

}
