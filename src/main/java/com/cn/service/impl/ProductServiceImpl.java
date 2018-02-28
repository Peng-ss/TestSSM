package com.cn.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.dao.ProductMapper;
import com.cn.pojo.Product;
import com.cn.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Resource
	ProductMapper productMapper;

	@Override
	public int insert(String type, String name, String username, BigDecimal price, int count) {
		return this.productMapper.insert(type, name, username, price, count);
	}

	@Override
	public ArrayList<Product> productshow(String username) {
		return this.productMapper.productshow(username);
	}

	@Override
	public ArrayList<Product> productShowAll() {
		return this.productMapper.productshowall();
	}


}
