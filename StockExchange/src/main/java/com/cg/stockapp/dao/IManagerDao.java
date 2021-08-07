package com.cg.stockapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.stockapp.dto.Company;
import com.cg.stockapp.dto.Manager;
import com.cg.stockapp.dto.User;

@Repository
public interface IManagerDao extends JpaRepository<User, Integer>{

//	public boolean addManager(Manager info);
//	public List<Manager> getAllManager();
//	public Manager getManagerDetails(String managerId);
//	public Manager UpdateManager(Manager info);
//	public Manager deleteManager(String managerId);
//	public Manager getManager(Company company);
}
