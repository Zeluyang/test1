package cn.itcast.dao.ipml;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.itcast.dao.CustomerDao;
import cn.itcast.model.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	public Customer findOne(Long custId) {
		return this.getHibernateTemplate().get(Customer.class, custId);
	}

}
