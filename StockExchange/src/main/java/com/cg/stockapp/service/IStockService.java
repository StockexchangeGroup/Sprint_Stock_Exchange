package com.cg.stockapp.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.stockapp.dto.Investor;
import com.cg.stockapp.dto.Stock;

@Service
public interface IStockService {
	
	public Stock addStockDetails(Stock stock);
	public Stock updateStockDetails(Stock stock);
	public Stock removeStockDetails(Stock stock);
	public Stock viewStockDetails(Stock stock);
	public List<Stock> viewAllStockDetails();
	public Stock viewStockByCompanyName(String name);
	public List<Stock> viewStockByInvestor(Investor inv);
	public List<Stock> viewAllGrowingStocks(); // stocks where the price is increased 
	public List<Stock> viewAllReducingStocks();// stocks where the price is reduced.
}
