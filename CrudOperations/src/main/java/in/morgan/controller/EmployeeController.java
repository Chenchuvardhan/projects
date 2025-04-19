package in.morgan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import in.morgan.dto.EmployeeDto;
import in.morgan.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService empService;

	@PostMapping(value = "/saveemployee")
	public EmployeeDto saveEmployee(EmployeeDto empDto) {
		try {
			return empService.saveEmployee(empDto);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
}
