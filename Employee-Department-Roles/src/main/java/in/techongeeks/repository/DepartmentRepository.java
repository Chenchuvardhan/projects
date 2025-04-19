package in.techongeeks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.techongeeks.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
public abstract List<Department> findByDeptName(String deptName);
}
