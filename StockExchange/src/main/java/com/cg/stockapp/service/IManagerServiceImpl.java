package com.cg.stockapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.stockapp.dao.IManagerDao;

@Service
public class IManagerServiceImpl {

	@Autowired
	IManagerDao managerDao;
}
