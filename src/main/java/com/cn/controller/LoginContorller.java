package com.cn.controller;


import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.pojo.Product;
import com.cn.pojo.User;
import com.cn.service.ProductService;
import com.cn.service.UserService;

@Controller
public class LoginContorller  {
	
	@Resource
	UserService userService;
	@Resource
	ProductService productService;
	
	@RequestMapping("/login")
	private String login(HttpServletRequest req,Model model) {
		String username =req.getParameter("username");
		String password =req.getParameter("password");
		User user = this.userService.login(username, password);
		if (user!=null) {
			model.addAttribute("user",user);
			HttpSession session = req.getSession();
			session.setAttribute("username", username);
			ArrayList<Product> products=productService.productshow(username);
			model.addAttribute("products",products);
			return "manage";
		}
		else {
			System.out.println("没有该用户");
			return "regist";
		}
	}
}
