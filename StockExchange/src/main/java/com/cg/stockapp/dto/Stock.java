package com.cg.stockapp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Stock {

	@Id
	@GeneratedValue
	private int stockId;
	private String stockName;
	@Autowired
	@OneToOne(targetEntity = Investor.class)
	private Investor investor;
	@Autowired
	@OneToOne(targetEntity = Company.class)
	private Company company;
	private int quantity;
	private String type;
	private double avgPrice;
	private int totalStocks;
	private double profitLoss;
	private String status;
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public Investor getInvestor() {
		return investor;
	}
	public void setInvestor(Investor investor) {
		this.investor = investor;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAvgPrice() {
		return avgPrice;
	}
	public void setAvgPrice(double avgPrice) {
		this.avgPrice = avgPrice;
	}
	public int getTotalStocks() {
		return totalStocks;
	}
	public void setTotalStocks(int totalStocks) {
		this.totalStocks = totalStocks;
	}
	public double getProfitLoss() {
		return profitLoss;
	}
	public void setProfitLoss(double profitLoss) {
		this.profitLoss = profitLoss;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockName=" + stockName + ", investor=" + investor + ", company="
				+ company + ", quantity=" + quantity + ", type=" + type + ", avgPrice=" + avgPrice + ", totalStocks="
				+ totalStocks + ", profitLoss=" + profitLoss + ", status=" + status + "]";
	}
	
	
}
