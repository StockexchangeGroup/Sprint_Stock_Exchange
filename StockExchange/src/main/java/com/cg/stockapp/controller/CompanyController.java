package com.cg.stockapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


import com.cg.stockapp.service.ICompanyServiceImpl;

@RestController
public class CompanyController {

	@Autowired
	ICompanyServiceImpl companyServiceImpl;
}
