package in.zee.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.zee.entity.Subscriber;

public interface SubscriberRepository extends JpaRepository<Subscriber,Integer> {
public abstract Subscriber findByEmail(String email);
}
