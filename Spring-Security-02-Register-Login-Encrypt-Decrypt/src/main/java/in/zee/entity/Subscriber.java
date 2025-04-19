package in.zee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "user")
public class Subscriber {
    @Id
    @SequenceGenerator(name = "secgen",initialValue = 1,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="secgen")
	private Integer id;
    private String name;
    private String email;
    private String password;
    private Long phno;
    
}
