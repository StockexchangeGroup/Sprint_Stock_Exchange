package com.cg.stockapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.stockapp.dto.Company;
import com.cg.stockapp.dto.User;

@Repository
public interface ICompanyDao extends JpaRepository<User, Integer>{

//	public Company addCompanyInfo(Company info);
//	public List<Company> getAllCompanyInfo();
//	public Company getCompanyDetails(String companyId);
//	public Company updateCompanyInfo(Company info);
//	public Company deleteCompanyInfo(String companyId);
}
