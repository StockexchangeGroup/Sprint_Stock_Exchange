package com.cg.stockapp.service;

import org.springframework.stereotype.Service;

import com.cg.stockapp.dto.User;

@Service
public interface IUserService {

	public User login(String username,String password);
	public User logout(User user);
	public User createUser(User user);
	public User updateUser(User user);
	public User removeUser(User user);
}
