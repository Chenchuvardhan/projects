package in.techongeeks.dao;

import lombok.Data;

@Data
public class EmployeeDao {
	private Integer empId; 
	private String name;
	private String email;
	private Double salary;
	private Integer deptId;
	private Integer  roleId;
}
