package com.example.Library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl {

	@Autowired
	RepositoryLibrary repo;
	public  <Customer> String createCustomer(Customer customer) {
		
		return null;
		
	}
}
