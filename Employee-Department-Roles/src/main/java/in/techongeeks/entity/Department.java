package in.techongeeks.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
public class Department {
    @Id
	private Integer deptId;
    private String deptName;
    @OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY,mappedBy="dept")
    private List<Employee> employees;
}
