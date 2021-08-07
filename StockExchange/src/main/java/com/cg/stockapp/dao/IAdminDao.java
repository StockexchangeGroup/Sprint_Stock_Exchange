package com.cg.stockapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.stockapp.dto.Admin;

@Repository
public interface IAdminDao extends JpaRepository<Admin, Integer>{

//	public Admin addAdmin(Admin admin);
//	public Admin viewAdmin(Admin admin);
//	public Admin updateAdmin(Admin admin);
//	public Admin removeAdmin(Admin admin);
}
