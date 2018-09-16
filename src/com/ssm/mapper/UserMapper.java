package com.ssm.mapper;

import org.apache.ibatis.annotations.Param;

import com.ssm.pojo.User;

public interface UserMapper {
	//查找用户
	public User findUserbyNameAndPwd(@Param("username") String username,@Param("password") String password);
	public User findUserbyName(String username);
}
