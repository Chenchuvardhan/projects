package in.techongeeks.service;

import java.util.List;

import in.techongeeks.dao.EmployeeDao;
import in.techongeeks.entity.Department;
import in.techongeeks.entity.Employee;
import in.techongeeks.entity.Roles;

public interface IEmployeeService {
public abstract List<Employee> getEmployees();
public abstract boolean uniqueEmailCheck(String email); 
public abstract Employee saveEmployee(EmployeeDao empDao);
public abstract EmployeeDao getEmployeeDao(int id);
public abstract List<Employee> deleteEmployee(int id);
public abstract List<Department> getDepartments();
public abstract  List<Roles> getRoles();
public abstract List<Department> getDepartments(String deptName);
}
