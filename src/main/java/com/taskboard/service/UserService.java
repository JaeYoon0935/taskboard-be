package com.taskboard.service;

import java.util.List;
import com.taskboard.entity.User;

public interface UserService {
	
	public void join();
	
	public List<User> selectAll();
	
}
