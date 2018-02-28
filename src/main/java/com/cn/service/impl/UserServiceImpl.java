package com.cn.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.dao.UserMapper;
import com.cn.pojo.User;
import com.cn.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	UserMapper userMapper;

	@Override
	public User login(String username, String password) {
		return this.userMapper.login(username, password);
	}

	@Override
	public int regist(String username, String password, String sex) {
		return this.userMapper.regist(username, password, sex);
	}

	@Override
	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return this.userMapper.insertSelective(record);
	}


	

}
