package in.morgan.service;

import java.util.List;

import in.morgan.dto.EmployeeDto;

public interface EmployeeService {
public abstract EmployeeDto  saveEmployee(EmployeeDto empDto);
public abstract List<EmployeeDto> getEmployeeDto();
public abstract EmployeeDto getById(int eid);
public abstract boolean deleteById(int eid);
}
