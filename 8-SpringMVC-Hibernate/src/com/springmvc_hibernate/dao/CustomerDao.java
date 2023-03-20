package com.springmvc_hibernate.dao;

import java.util.List;

import com.springmvc_hibernate.entity.Customer;

public interface CustomerDao {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getRequiredCustomer(int id);

	public void deleteCustomer(int id);

}
