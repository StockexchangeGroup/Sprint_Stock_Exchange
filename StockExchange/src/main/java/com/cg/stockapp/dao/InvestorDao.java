package com.cg.stockapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.stockapp.dto.Company;
import com.cg.stockapp.dto.Investor;
import com.cg.stockapp.dto.Stock;

@Repository
public interface InvestorDao extends JpaRepository<Investor, Integer> {
//
//	public Investor addInvestor(Investor info);
//	public  List<Investor> getAllInvestor();
//	public Investor getInvestorDetails(String investorId);
//	public Investor  updateInvestor(Investor info);
//	public Investor deleteInvestor(Investor inv);
//	public List<Investor> viewAllInvestor(Stock stock);
//	public List<Investor> viewAllInvestor(Company company);
//	public Investor buyStock(Stock stock ,Investor investor,int quantity);
//	public Investor sellStock(Stock stock ,Investor investor,int quantity);
}
