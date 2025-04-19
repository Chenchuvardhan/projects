package in.techongeeks.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Roles {
	@Id
	private Integer roleId;
	private String roleName;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="role")
	private List<Employee> emps;
}
