package com.taskboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taskboard.entity.User;
import com.taskboard.service.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
public class mainController {
	
	@Autowired
	UserService userServiceImpl;
	
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/join")
	@ResponseBody
	public String join() {
		userServiceImpl.join();
		return "success";
	}
	
	@RequestMapping("/selectAll")
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> userList = userServiceImpl.selectAll();
        return ResponseEntity.ok(userList);
    }
	
}
