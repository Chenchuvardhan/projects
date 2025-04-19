package in.techongeeks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.techongeeks.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
public abstract Employee findByEmail(String email); 
}
