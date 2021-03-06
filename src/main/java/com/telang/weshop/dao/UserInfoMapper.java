package com.telang.weshop.dao;


import org.apache.ibatis.annotations.Param;

import com.telang.weshop.entity.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer id);//删除指定id的用户

    int insert(UserInfo record); //插入用户信息

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    //根据用户id去更新用户的信息
    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
    
    //获取用户列表
    UserInfo[] selectAll();
    
    //获取指定用户名的用户信息
    UserInfo selectByUsername(String username);
    
    //用户登录接口
    int login(@Param("username") String username , @Param("password")String password);
}