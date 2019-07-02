package com.fse.projectManager.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fse.projectManager.entity.User;

@RestController
@CrossOrigin("*")
@RequestMapping("/userApi")
public class UserController {
	
	
	@RequestMapping(method=RequestMethod.POST, path="/user")
	public String createUser(@RequestBody User user )
	{
		System.out.print("Inside the Add User Method");
		return null;
	}

	@RequestMapping(method=RequestMethod.GET, path="/user")
	public String getUsers(@RequestBody User user )
	{
		return null;
	}

	@RequestMapping(method=RequestMethod.PUT, path="/user")
	public String UpdateUser(@RequestBody User user )
	{
		return null;
	}

	@RequestMapping(method=RequestMethod.DELETE, path="/user")
	public String deleteUser(@RequestBody User user )
	{
		return null;
	}

}
