package cn.itcast.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/applicationContext-*.xml")
public class CustomerDaoTest {

	@Autowired
	private CustomerDao customerDao; 
	@Test
	public void testFindOne() {
		customerDao.findOne(new Long(1));
	}

}
