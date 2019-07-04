package com.fse.projectManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fse.projectManager.entity.User;
import com.fse.projectManager.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserRepository userRepo;
	
	private static final String SUCCESS = "SUCCESS";
	private static final String FAILURE = "FAILURE";
	
	@Override
	public boolean saveUser(User user) {
		if(null != user) {
			 userRepo.save(user);
			 return true;
		}
		return false;
	}

	@Override
	public List getUserList() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		try {
				userRepo.save(user);
				return true;
	}catch(Exception e)
		
		{
			return false;
		}
	}

	@Override
	public boolean deleteUser(int userId) {
		// TODO Auto-generated method stub
		try {
			userRepo.deleteById(userId);
			return true;
}catch(Exception e)
	
	{
		return false;
	}
	}

}
