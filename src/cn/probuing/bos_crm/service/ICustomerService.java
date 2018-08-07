package cn.probuing.bos_crm.service;

import cn.probuing.bos_crm.domain.Customer;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface ICustomerService {
	public List<Customer> findAll();
	//查询未关联到定区的客户
	public List<Customer> findListNotAssociation();
	//查询已经关联到指定定区的客户
	public List<Customer> findListHasAssociation(String decidedzoneId);
	//定区关联客户
	public void assigncustomerstodecidedzone(String decidedzoneId, Integer[] customerIds);
}
