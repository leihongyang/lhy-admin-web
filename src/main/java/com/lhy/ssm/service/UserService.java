package com.lhy.ssm.service;

import java.util.List;

import com.lhy.ssm.entity.User;

public interface UserService {

	User login(User user);
	
	User getUserById(int id);
	
	List<User> getAllUsers();

    void addUser(String userName);

    void deleteUser(Integer userId);

    void deleteAll();
}
