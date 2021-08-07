package com.cg.stockapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.stockapp.dao.ICompanyDao;

@Service
public class ICompanyServiceImpl {

	@Autowired
	ICompanyDao companyDao;
}
