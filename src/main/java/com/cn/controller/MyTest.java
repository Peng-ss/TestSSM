package com.cn.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.pojo.User;
import com.cn.service.UserService;

@Controller
public class MyTest {
	
	@Resource
	UserService userService;
	User user=new User();
	@RequestMapping("/mytest")
	public void Test() {
		// TODO Auto-generated constructor stub
		
		user.setUsername("hailing");
		user.setPassword("123");
		int a=userService.insertSelective(user);
		System.out.println(a);
		System.out.println("已经进来/mytest");
	}
}
