package com.fse.projectManager.service;

import java.util.List;

import com.fse.projectManager.entity.User;

public interface UserService {
	
	public boolean saveUser(User user);
	public List  getUserList();
	public boolean  updateUser(User user);
	public boolean deleteUser(int userId);

}
