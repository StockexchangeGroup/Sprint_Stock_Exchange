package com.cg.stockapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.stockapp.dto.Company;
import com.cg.stockapp.dto.Investor;
import com.cg.stockapp.dto.Stock;

@Service
public interface InvestorService {
	
	public Investor addInvestor(Investor info);
	public  List<Investor> getAllInvestor();
	public Investor getInvestorDetails(String investorId);
	public Investor  updateInvestor(Investor info);
	public Investor deleteInvestor(Investor inv);
	public List<Investor> viewAllInvestor(Stock stock);
	public List<Investor> viewAllInvestor(Company company);
	public Investor buyStock(Stock stock ,Investor investor,int quantity);
	public Investor sellStock(Stock stock ,Investor investor,int quantity);

	
}