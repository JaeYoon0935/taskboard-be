package com.taskboard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.taskboard.entity.User;
import com.taskboard.repository.UserRepository;
import com.taskboard.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void join() {
		User user = new User();
		user.setUserName("testUser");
		user.setEmail("test@example.com");
		userRepository.save(user);
	}
	
	@Override
	public List<User> selectAll() {
		return userRepository.findAll();
	}
	
}
