package com.fse.projectManager.controller;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fse.projectManager.entity.User;
import com.fse.projectManager.repository.UserRepository;
import com.fse.projectManager.service.UserService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(method=RequestMethod.POST, path="/adduser")
	public ResponseEntity addUser(@RequestBody User user )
	{
		System.out.print("Inside the Add User Method");
		if(userService.saveUser(user)) {
			return new ResponseEntity<String>(HttpStatus.OK);
		}
		return new ResponseEntity<String>(HttpStatus.EXPECTATION_FAILED);
	}

	@RequestMapping(method=RequestMethod.GET, path="/userList")
	public List getUsers()
	{
		return userService.getUserList();
	}

	@RequestMapping(method=RequestMethod.PUT, path="/userUpdate")
	public ResponseEntity UpdateUser(@RequestBody User user )
	{
		System.out.print("Inside the Update User Method");
		if(userService.updateUser(user)) {
			return new ResponseEntity<String>(HttpStatus.OK);
		}
		return new ResponseEntity<String>(HttpStatus.EXPECTATION_FAILED);
	}

	@RequestMapping(method=RequestMethod.DELETE, path="/userDelete/{userId}")
	public ResponseEntity deleteUser(@PathVariable("userId") String userId )
	{
		System.out.print("Inside the Delete User Method");
		if(userService.deleteUser(Integer.parseInt(userId))) {
			return new ResponseEntity<String>(HttpStatus.OK);
		}
		return new ResponseEntity<String>(HttpStatus.EXPECTATION_FAILED);
	}

}
