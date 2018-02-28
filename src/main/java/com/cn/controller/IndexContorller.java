package com.cn.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.pojo.Product;
import com.cn.service.ProductService;

@Controller
public class IndexContorller {
	@Resource
	ProductService productService;
	
	@RequestMapping("/index")
	public String index(HttpServletRequest req,Model model){
		ArrayList<Product> products=this.productService.productShowAll();
		String username =req.getParameter("username");
		if (products !=null) {
			model.addAttribute("allproduct",products);
			return "index";
		}
		else {
			return "index";
		}
		
	}
}
