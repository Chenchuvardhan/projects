package com.jagannadh;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Ques - 2
-----------
Employee Performance Evaluation
You need to create a class that models an Employee in a performance
evaluation system. The Employee class should have the following
attributes:

Class name: Employee(BLC)
Attributes:

private: employeeName (String)
private: department (String)
private: baseSalary (double)
private: performanceScore (int) - a score between 1 and 10 representing
the employee's performance.
The performance score affects the employee's bonus. The bonus is calculated as:

Implement below methods:

Method name: calculateBonus()
return type: double
modifiers: public
Logic:
If the performance score is between 8 and 10, the bonus is 20% of the base salary.
If the performance score is between 5 and 7, the bonus is 10% of the base salary.
If the performance score is below 5, there is no bonus.
After calculating return the bonus.

Implement public setter methods to initialize each of these attributes.

Implement public getter methods to retrieve the values of these attributes

Create an ELC class EmployeeTester
Write a main method to:
Create an instance of the Employee class.
Initialize the attributes using setters.
Calculate and print the bonus with employee name, department, baseSalary by using getters.
*/
class Employee {
	private String employeeName;
	private String department;
	private Double baseSalary;
	private Integer performanceScore;

	Double calculateBonus() {
		Integer score = getPerformanceScore();
		double bonus = 0.0;
		if (score < 5) {
			return bonus;
		} else {
			if (score >= 8 && score <= 10) {
				bonus = (baseSalary * 20) / 100;
				setBaseSalary(baseSalary + bonus);
				return bonus;
			}
			if (score >= 5 && score < 8) {
				bonus = (baseSalary * 10) / 100;
				setBaseSalary(baseSalary + bonus);
				return bonus;
			}
			return bonus;
		}
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Integer getPerformanceScore() {
		return performanceScore;
	}

	public void setPerformanceScore(Integer performanceScore) {
		this.performanceScore = performanceScore;
	}

	public Employee(String employeeName, String department, Double baseSalary, Integer performanceScore) {

		super();
		this.employeeName = employeeName;
		this.department = department;
		this.baseSalary = baseSalary;
		if (performanceScore > 10 && performanceScore < 0)
			this.performanceScore = 0;
		else
			setPerformanceScore(performanceScore);
	}

	public Employee() {

	}
}

public class EmployeeTester {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		Employee emp = new Employee("rajesh", "operations", 10000.00, 7);
		List<Employee> list = new ArrayList<Employee>();

		for (int i = 0; i < 100000; i++) {
			list.add(new Employee("rajesh", "operations", 10000.00, 7));
		}
		Double calculateBonus = emp.calculateBonus();
		// list.stream().forEach(e->System.out.println(emp.getEmployeeName()+" - bonus
		// increased by "+calculateBonus));
		// LocalTime now2 = LocalTime.now();
		// Duration between = Duration.between(now, now2);
		// System.out.println(between);
		list.add(0, emp);
		// System.out.println(list);
		Iterator<Employee> iterator = list.iterator();
		
		new Scanner(System.in);

	}
}
