package in.morgan.dto;

import lombok.Data;

@Data
public class EmployeeDto {
	private Long eid;
	private String ename;
	private String deptName;
	private Double salary;
}
