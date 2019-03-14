package cn.itcast.service.impl;

import cn.itcast.dao.CustomerDao;
import cn.itcast.model.Customer;
import cn.itcast.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public Customer findOne(Long custId) {
		return customerDao.findOne(custId);
	}

}
