package in.techongeeks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.techongeeks.entity.Roles;

public interface RoleRepository extends JpaRepository<Roles, Integer> {

}
