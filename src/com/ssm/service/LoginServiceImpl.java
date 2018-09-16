package com.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.UserMapper;
import com.ssm.pojo.User;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User findUserByNameAndPwd(String username, String password) {
		User user = userMapper.findUserbyNameAndPwd(username, password);
		

		return user;
	}
}
