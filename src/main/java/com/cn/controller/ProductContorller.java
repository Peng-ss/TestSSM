package com.cn.controller;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.pojo.Product;
import com.cn.service.ProductService;

@Controller
public class ProductContorller {

	@Resource
	ProductService productService;

	@RequestMapping("/productAdd")
	private String productAddd(HttpServletRequest request, Model model) {
		BigDecimal price = new BigDecimal(request.getParameter("price"));
		int count = Integer.parseInt(request.getParameter("count"));
		int result = this.productService.insert(request.getParameter("type"), 
				request.getParameter("name"), 
				request.getParameter("username"), price, count);
		if (result == 1) {
			ArrayList<Product> products=productService.productshow(request.getParameter("username"));
			model.addAttribute("products",products);
			return "manage";
		}
		else {
			return "manage";
		}
	}
}
