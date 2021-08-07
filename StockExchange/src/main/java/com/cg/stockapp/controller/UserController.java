package com.cg.stockapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


import com.cg.stockapp.service.IUserServiceImpl;

@RestController
public class UserController {

	@Autowired
	IUserServiceImpl userServiceImpl;
}
