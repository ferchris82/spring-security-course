package chrisferdev.springsecuritycourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import chrisferdev.springsecuritycourse.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
