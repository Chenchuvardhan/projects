package in.morgan.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.morgan.dto.EmployeeDto;
import in.morgan.entity.Employee;
import in.morgan.repo.EmployeeRepo;

@Service
public class EmployeeServiceOperations implements EmployeeService {
	@Autowired
	private EmployeeRepo empRepo;

	@Override
	public EmployeeDto saveEmployee(EmployeeDto empDto) {
		// TODO Auto-generated method stub
		try {
			Employee emp = new Employee();
			BeanUtils.copyProperties(empDto, emp);
			Employee employee = empRepo.save(emp);
			BeanUtils.copyProperties(employee, empDto);
			return empDto;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public List<EmployeeDto> getEmployeeDto() {
		// TODO Auto-generated method stub
		try {
			List<Employee> all = empRepo.findAll();
			if (all.size() != 0)
				return all.stream().map(e -> {
					EmployeeDto employeeDto = new EmployeeDto();
					BeanUtils.copyProperties(e, employeeDto);
					return employeeDto;
				}).collect(Collectors.toList());
			return new ArrayList<EmployeeDto>(0);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public EmployeeDto getById(int eid) {
		// TODO Auto-generated method stub
		try {
			Optional<EmployeeDto> map = empRepo.findById(eid).map(e -> {
				EmployeeDto employeeDto = new EmployeeDto();
				BeanUtils.copyProperties(e, employeeDto);
				return employeeDto;
			});
			boolean present = map.isPresent();
			return present ? map.get() : null;

		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean deleteById(int eid) {
		// TODO Auto-generated method stub
		try {
			empRepo.deleteById(eid);
			return empRepo.findById(eid).isPresent();
		} catch (Exception e) {
			return empRepo.findById(eid).isPresent();
		}
	}

}
