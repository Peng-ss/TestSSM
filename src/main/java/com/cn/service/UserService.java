package com.cn.service;

import com.cn.pojo.User;

public interface UserService {
	public User login(String username,String password);
	
	public int regist(String username,String password,String sex);
	
	public int insertSelective(User record);
}
