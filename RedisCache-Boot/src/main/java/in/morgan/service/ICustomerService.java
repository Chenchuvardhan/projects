package in.morgan.service;

import java.util.List;

import in.morgan.entity.Customer;

public interface ICustomerService {
public abstract Customer saveCustomer(Customer customer);
public abstract List<Customer> getAllCustomers();
}
