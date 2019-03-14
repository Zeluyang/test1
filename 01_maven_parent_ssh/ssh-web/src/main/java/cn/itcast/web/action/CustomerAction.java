package cn.itcast.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.model.Customer;
import cn.itcast.service.CustomerService;

@SuppressWarnings("serial")
public class CustomerAction extends ActionSupport {

	private CustomerService customerService;
	private Long custId = new Long(1);

	public String save() throws Exception {
		return SUCCESS;
	}

	public String findOne() throws Exception {
		Customer customer = customerService.findOne(custId);
		//推入值栈中
		ActionContext.getContext().getValueStack().push(customer);
		return SUCCESS;
	}

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}
}
