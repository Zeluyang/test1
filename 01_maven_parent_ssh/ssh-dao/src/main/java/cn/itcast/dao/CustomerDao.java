package cn.itcast.dao;

import cn.itcast.model.Customer;

public interface CustomerDao {

	Customer findOne(Long custId);

}
