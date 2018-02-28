package com.cn.dao;

import com.cn.pojo.Indent;

public interface IndentMapper {
    int insert(Indent record);

    int insertSelective(Indent record);
}