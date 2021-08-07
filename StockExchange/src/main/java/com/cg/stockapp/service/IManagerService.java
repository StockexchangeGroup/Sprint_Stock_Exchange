package com.cg.stockapp.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.stockapp.dto.Company;
import com.cg.stockapp.dto.Manager;

@Service
public interface IManagerService {

		boolean addManager(Manager info);
		public List<Manager> getAllManager();
		public Manager getManagerDetails(String managerId);
		public Manager updateManager(Manager info);
		public Manager deleteManager(String managerId);
		public Manager getManager(Company company);

}
