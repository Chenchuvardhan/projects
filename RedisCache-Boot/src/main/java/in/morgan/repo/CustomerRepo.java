package in.morgan.repo;

import org.springframework.data.repository.CrudRepository;

import in.morgan.entity.Customer;
public interface CustomerRepo extends CrudRepository<Customer, Integer>{

}
