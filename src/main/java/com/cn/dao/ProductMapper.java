package com.cn.dao;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.cn.pojo.Product;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(String type, String name, String username, BigDecimal price, int count);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
    
    ArrayList<Product> productshow(String username);

	ArrayList<Product> productshowall();
}