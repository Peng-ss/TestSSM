package com.cn.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.pojo.User;
import com.cn.service.UserService;

@Controller
public class RegistContorller {
	
	@Resource
	UserService userService;
	
	
	@RequestMapping("/regist")
	private String regist(HttpServletRequest req, Model model) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String sex = req.getParameter("sex");
		 if(this.userService.regist(username, password, sex) !=1){
			 return "regist";
		 }
		 else {
			 User user = this.userService.login(username, password); 
			 model.addAttribute(user);
			 return "manage";			
		}
		
		
	}
}
