package com.mphasis;

import java.util.Objects;

public class Employee {

private Integer id;
private String name;
private Double salary;
private String gender;
private String email;
public Employee(Integer id, String name, Double salary, String gender, String email, String country) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.gender = gender;
	this.email = email;
	this.country = country;
}
private String country;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public int hashCode() {
	return Objects.hash(country, email, gender, id, name, salary);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(country, other.country) && Objects.equals(email, other.email)
			&& Objects.equals(gender, other.gender) && Objects.equals(id, other.id) && Objects.equals(name, other.name)
			&& Objects.equals(salary, other.salary);
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", gender=" + gender + ", email="
			+ email + ", country=" + country + "]";
}
}
