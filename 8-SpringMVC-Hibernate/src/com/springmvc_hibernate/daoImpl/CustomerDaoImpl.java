package com.springmvc_hibernate.daoImpl;

import java.util.List;
import com.springmvc_hibernate.dao.CustomerDao;
import com.springmvc_hibernate.entity.Customer;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Customer> query= currentSession.createQuery("from Customer order by firstName", Customer.class);
		
		List<Customer> customers = query.getResultList();
		
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(theCustomer);
	}

	@Override
	public Customer getRequiredCustomer(int theid) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		
//		Query<Customer> query= currentSession.createQuery("from Customer where id= :theid");
//		query.setParameter("theid", theid);
//		Customer customer = query.getSingleResult();
		
		Customer customer = currentSession.get(Customer.class,theid);
		
		return customer;
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		
		Customer customer = currentSession.get(Customer.class,id);
		currentSession.delete(customer);
		
//		Query<Customer> query= currentSession.createQuery("delete from Customer where id=:customerId", Customer.class);
//		query.setParameter("customerId",id);
//		
//		query.executeUpdate();
		
	}

}
