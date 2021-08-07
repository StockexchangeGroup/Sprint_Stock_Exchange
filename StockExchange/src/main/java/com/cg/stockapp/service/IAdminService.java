package com.cg.stockapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.stockapp.dto.Admin;

@Service
public interface IAdminService {
	
	public Admin addAdmin(Admin admin);
	public Admin viewAdmin(Admin admin);
	public Admin removeAdmin(Admin admin);
	public Admin updateAdmin(Admin admin);
	public List<Admin> viewAllAdmin();
}
