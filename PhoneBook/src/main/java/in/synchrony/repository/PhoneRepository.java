package in.synchrony.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.synchrony.entity.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Integer> {

}
