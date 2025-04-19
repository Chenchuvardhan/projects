package in.techongeeks.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.techongeeks.dao.EmployeeDao;
import in.techongeeks.entity.Department;
import in.techongeeks.entity.Employee;
import in.techongeeks.entity.Roles;
import in.techongeeks.repository.DepartmentRepository;
import in.techongeeks.repository.EmployeeRepository;
import in.techongeeks.repository.RoleRepository;

@Service
public class EmployeeService implements IEmployeeService {
	@Autowired
    private EmployeeRepository empRepo;
	@Autowired
	private DepartmentRepository deptRepo;
	@Autowired
	private RoleRepository roleRepo;
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public boolean uniqueEmailCheck(String email) {
		// TODO Auto-generated method stub
		
		return empRepo.findByEmail(email)==null;
	}

	@Override
	public Employee saveEmployee(EmployeeDao empDao) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
	   BeanUtils.copyProperties(empDao,emp);
	   emp.setEmployeeId(empDao.getEmpId());
	   Optional<Department> byId = deptRepo.findById(empDao.getDeptId());
	   emp.setDept(byId.get());
	   Optional<Roles> byId2 = roleRepo.findById(empDao.getRoleId());
	   Roles roles = byId2.get();
	   emp.setRole(roles);
		return empRepo.save(emp);
	}

	@Override
	public List<Department> getDepartments() {
		// TODO Auto-generated method stub
		return deptRepo.findAll();
	}

	@Override
	public List<Roles> getRoles() {
		// TODO Auto-generated method stub
		
		return roleRepo.findAll();
	}

	@Override
	public List<Department> getDepartments(String deptName) {
		// TODO Auto-generated method stub
		return deptRepo.findByDeptName(deptName);
	}

	@Override
	public EmployeeDao getEmployeeDao(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> byId = empRepo.findById(id);
	    Employee employee = byId.get();
	    EmployeeDao employeeDao = new EmployeeDao();
	    BeanUtils.copyProperties(employee, employeeDao);
	    employeeDao.setEmpId(employee.getEmployeeId());
	    employeeDao.setDeptId(employee.getDept().getDeptId());
	    employeeDao.setRoleId(employee.getRole().getRoleId());
		return employeeDao;
	}

	@Override
	public List<Employee> deleteEmployee(int id) {
		// TODO Auto-generated method stub
		Employee employee = empRepo.findById(id).get();
		Department dept = employee.getDept();
		dept.setEmployees(null);
		Roles role = employee.getRole();
		role.setEmps(null);
		employee.setDept(null);
		employee.setRole(null);
		empRepo.delete(employee);
		List<Employee> all = empRepo.findAll();
		return all;
	}

}
