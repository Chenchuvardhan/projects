package in.techongeeks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import in.techongeeks.dao.EmployeeDao;
import in.techongeeks.entity.Department;
import in.techongeeks.entity.Employee;
import in.techongeeks.entity.Roles;
import in.techongeeks.service.IEmployeeService;
@Controller
public class EmployeeController {

	@Autowired
	private IEmployeeService empService;
	@GetMapping("/")
    public String loadIndex() {
    	return "index";
    }
	@GetMapping(value = "/registerpage")
	public String loadEmployeeForm(Model model) {
        EmployeeDao empDao=new EmployeeDao();
        model.addAttribute("empdao", empDao);
        List<Department> departments = empService.getDepartments();
        model.addAttribute("departments",departments);
        List<Roles> roles = empService.getRoles();
        model.addAttribute("roles", roles);
		return "register";
	}
	@PostMapping(value="/save")
	public String saveEmployee(EmployeeDao empDa,Model model){
		Employee saveEmployee = empService.saveEmployee(empDa);
		if(saveEmployee!=null) {
	        model.addAttribute("smsg","employee saved");
		}
		EmployeeDao empDao=new EmployeeDao();
        model.addAttribute("empdao", empDao);
        List<Department> departments = empService.getDepartments();
        model.addAttribute("departments",departments);
        List<Roles> roles = empService.getRoles();
        model.addAttribute("roles", roles);
		return "register";
	}
	@GetMapping(value="/view")
	public String retrieveEmployees(Model model) {
		List<Employee> employees = empService.getEmployees();
		model.addAttribute("employees", employees);
		return "view-employees";
	}
	@GetMapping(value="/edit/{id}")
	public String editEmployee(@PathVariable int id,Model model) {
	EmployeeDao employeeDao = empService.getEmployeeDao(id);
	model.addAttribute("empdao", employeeDao);
	List<Department> departments = empService.getDepartments();
    model.addAttribute("departments",departments);
    List<Roles> roles = empService.getRoles();
    model.addAttribute("roles", roles);
	return "register";	
	}
	@GetMapping(value="/delete/{id}")
	public String deleteEmployee(@PathVariable int id,Model model) {
		model.addAttribute("employees",empService.deleteEmployee(id));
		return "view-employees";
	}
	@GetMapping(value="/manage")
	public String manageHtml() {
		return "manage";
	}
}
