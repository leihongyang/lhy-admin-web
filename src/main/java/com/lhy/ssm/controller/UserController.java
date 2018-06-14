package com.lhy.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import com.lhy.ssm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lhy.ssm.entity.User;
import com.lhy.ssm.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/userlist.json")
    public @ResponseBody List<User> getUserList() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/addUser/{userName}", method = RequestMethod.POST)
    public @ResponseBody void addUser(@PathVariable("userName") String userName) {
    	userService.addUser(userName);
    }

    @RequestMapping(value = "/removeUser/{userId}", method = RequestMethod.DELETE)
    public @ResponseBody void removeUser(@PathVariable("userId") Integer userId) {
    	userService.deleteUser(userId);
    }

    @RequestMapping(value = "/removeAllUsers", method = RequestMethod.DELETE)
    public @ResponseBody void removeAllUsers() {
    	userService.deleteAll();
    }

    @RequestMapping("/layout")
    public String getUserPartialPage() {
        return "users/layout";
    }
	
}
