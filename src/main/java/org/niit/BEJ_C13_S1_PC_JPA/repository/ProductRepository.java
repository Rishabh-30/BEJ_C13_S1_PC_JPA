package org.niit.BEJ_C13_S1_PC_JPA.repository;

import org.niit.BEJ_C13_S1_PC_JPA.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
