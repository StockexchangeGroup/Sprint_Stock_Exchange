package com.cg.stockapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cg.stockapp.service.IAdminServiceImpl;
import com.cg.stockapp.service.IStockServiceImpl;

@RestController
public class StockController {

	@Autowired
	IStockServiceImpl stockServiceImpl;
}
