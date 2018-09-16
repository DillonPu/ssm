package com.ssm.service;

import com.ssm.pojo.User;

public interface LoginService {

	public User findUserByNameAndPwd(String username, String password);

}
