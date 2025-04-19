package in.morgan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.morgan.entity.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
