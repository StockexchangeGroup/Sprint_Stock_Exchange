package com.cg.stockapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.stockapp.dao.InvestorDao;

@Service
public class InvestorServiceImpl {

	@Autowired
	InvestorDao investorDao;
}
