package com.cg.stockapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.stockapp.dto.Company;

@Service
public interface ICompanyService {

	public Company addCompanyInfo(Company info);
	public	List<Company> getAllCompanyInfo();
	public	Company getCompanyDetails(String companyId);
	public Company updateCompanyInfo(Company info);
	public Company deleteCompanyInfo(String companyId);

}