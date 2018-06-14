package com.lhy.ssm.mapper;

import java.util.List;

import com.lhy.ssm.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

	User login(User user);
	
	User getUserById(int id);
	
	List<User> getAllUsers();

    void addUser(String userName);

    void deleteUser(Integer userId);

    void deleteAll();
}
