package com.cg.stockapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.stockapp.dto.User;

@Repository
public interface IUserDao extends JpaRepository<User, Integer>{

//	public User login(String username,String password);
//	public User logout(User user);
//	public User createUser(User user);
//	public User removeUser(User user);
}
