package in.morgan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.morgan.entity.Customer;
import in.morgan.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	private CustomerRepo custRepo;

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Customer save = custRepo.save(customer);

		return save != null ? save : null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub

		Iterable<Customer> all = custRepo.findAll();
		return (List<Customer>) all;
	}

}
