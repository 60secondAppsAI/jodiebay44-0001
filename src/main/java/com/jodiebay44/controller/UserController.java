package com.jodiebay44.controller;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;
import java.util.ArrayList;


import com.jodiebay44.util.Util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.sql.Timestamp;
import java.util.Date;

import com.jodiebay44.domain.User;
import com.jodiebay44.dto.UserDTO;
import com.jodiebay44.dto.UserSearchDTO;
import com.jodiebay44.dto.UserPageDTO;
import com.jodiebay44.service.UserService;
import com.jodiebay44.dto.common.RequestDTO;
import com.jodiebay44.dto.common.ResultDTO;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;




@CrossOrigin(origins = "*")
@RequestMapping("/user")
@RestController
public class UserController {

	private final static Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;



	//@AllowSystem(AuthScopes.READ)
	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<User> getAll() {

		List<User> users = userService.findAll();
		
		return users;	
	}

	//@ReadAccess
	@GetMapping(value = "/{userId}")
	@ResponseBody
	public UserDTO getUser(@PathVariable Integer userId) {
		
		return (userService.getUserDTOById(userId));
	}

 	//@WriteAccess
 	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public ResponseEntity<?> addUser(@RequestBody UserDTO userDTO, HttpServletRequest request) {
		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = userService.addUser(userDTO, requestDTO);
		
//		if (result.isSuccessful()) {
//		}
		
		return result.asResponseEntity();
	}

	//@ReadAccess
	@GetMapping("/users")
	public ResponseEntity<UserPageDTO> getUsers(UserSearchDTO userSearchDTO) {
 
		return userService.getUsers(userSearchDTO);
	}	

 	//@WriteAccess
	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	public ResponseEntity<?> updateUser(@RequestBody UserDTO userDTO, HttpServletRequest request) {
		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = userService.updateUser(userDTO, requestDTO);
		
//		if (result.isSuccessful()) {
//		}

		return result.asResponseEntity();
	}



}
