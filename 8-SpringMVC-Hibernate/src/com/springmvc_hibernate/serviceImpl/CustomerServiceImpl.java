package com.springmvc_hibernate.serviceImpl;

import java.util.List;

import com.springmvc_hibernate.dao.CustomerDao;
import com.springmvc_hibernate.entity.Customer;
import com.springmvc_hibernate.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerDao.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		
		customerDao.saveCustomer(theCustomer);
	}

	@Override
	@Transactional
	public Customer getRequiredCustomer(int id) {
		// TODO Auto-generated method stub
		return customerDao.getRequiredCustomer(id);
	}

	@Override
	@Transactional
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerDao.deleteCustomer(id);
	}
}
