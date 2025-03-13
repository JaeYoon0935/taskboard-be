package com.taskboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskboard.dto.BoardDto;
import com.taskboard.dto.PostsDto;
import com.taskboard.entity.Board;
import com.taskboard.entity.Posts;
import com.taskboard.service.BoardService;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/Board")
@RestController
public class BoardController {
	
	@Autowired
	BoardService boardServiceImpl;
	
	@RequestMapping("/getPostsList")
	public ResponseEntity<List<PostsDto>> getPostsList() {
		List<PostsDto> postsList = boardServiceImpl.getPostsList();
        return ResponseEntity.ok(postsList);
    }
	
	@RequestMapping("/regPost")
	public ResponseEntity regPost(@RequestBody Posts param) {
		Posts posts = boardServiceImpl.regPost(param);
		return ResponseEntity.ok(posts);
	}
	
	@RequestMapping("/postDetail")
	public ResponseEntity postDetail(@RequestBody Posts param) {
		PostsDto postsDto = boardServiceImpl.postDetail(param);
		return ResponseEntity.ok(postsDto);
	}
	
	@RequestMapping("/modPost")
	public ResponseEntity modPost(@RequestBody Posts param) {
		Posts posts = boardServiceImpl.modPost(param);
		return ResponseEntity.ok(posts);
	}
	
	@RequestMapping("/delPost")
	public ResponseEntity delPost(@RequestBody Posts param) {
		Posts posts = boardServiceImpl.delPost(param);
		return ResponseEntity.ok(posts);
	}
	
}
