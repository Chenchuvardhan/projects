package in.reliance.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.reliance.entity.JioSim;

public interface JioSimRepository extends JpaRepository<JioSim, Integer> {
public abstract JioSim findByEmail(String email); 
}
