package in.synchrony.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Contact {
    @Id
    @SequenceGenerator(name="contactgenerator",initialValue = 1,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "contactgenerator")
	private Integer conatctId;
    private String contactName;
    private String mobileNumber;
    @ManyToOne
    @JoinColumn(name="phone_id")
    private Phone phone;
}
