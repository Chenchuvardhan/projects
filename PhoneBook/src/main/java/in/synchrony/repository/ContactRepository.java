package in.synchrony.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.synchrony.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
