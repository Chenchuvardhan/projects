package in.techongeeks.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
	@Id
	@SequenceGenerator(name="stud",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="stud")
	private Integer employeeId;
	private String name;
	private String email;
	private Double salary;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="dept_id")
	private Department dept;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="role_id")
	private Roles role;
}
