package com.lhy.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.lhy.ssm.mapper.UserDao;
import com.lhy.ssm.entity.User;
import org.springframework.stereotype.Service;

import com.lhy.ssm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserDao userDao;

	@Override
	public User login(User user) {
		return userDao.login(user);
	}

	@Override
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}

	@Override
	public List<User> getAllUsers(){
		return userDao.getAllUsers();
	}

	@Override
    public void addUser(String userName){
    	userDao.addUser(userName);
    }

	@Override
    public void deleteUser(Integer userId){
    	userDao.deleteUser(userId);
    }

	@Override
    public void deleteAll(){
    	userDao.deleteAll();
    }

}
