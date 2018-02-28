package com.cn.service;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.cn.pojo.Product;


public interface ProductService {

	int insert(String type, String name, String username, BigDecimal price, int count);
	
	ArrayList<Product> productshow(String username);
	
	ArrayList<Product> productShowAll();
}
