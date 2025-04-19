package in.synchrony.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Phone {
@Id
@SequenceGenerator(name="phonegenerator",allocationSize = 1,initialValue = 1)
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="phonegenerator")
private Integer phoneId;
private String name;
private String mobileNumber;
private String email;
@OneToMany
private List<Contact> contacts;
}
