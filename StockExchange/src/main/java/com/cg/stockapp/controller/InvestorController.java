package com.cg.stockapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cg.stockapp.service.InvestorServiceImpl;

@RestController
public class InvestorController {

	@Autowired
	InvestorServiceImpl investorServiceImpl;
}
