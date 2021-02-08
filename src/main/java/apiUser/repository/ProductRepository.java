package apiUser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apiUser.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,String>{
}
