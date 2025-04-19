
package in.honeywell.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.honeywell.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
