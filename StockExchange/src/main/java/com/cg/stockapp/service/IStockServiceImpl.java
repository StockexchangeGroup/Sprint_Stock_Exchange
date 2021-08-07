package com.cg.stockapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.stockapp.dao.IStockDAO;

@Service
public class IStockServiceImpl {

	@Autowired
	IStockDAO stockDao;
}
