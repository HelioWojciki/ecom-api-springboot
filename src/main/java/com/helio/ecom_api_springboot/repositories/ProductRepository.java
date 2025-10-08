package com.helio.ecom_api_springboot.repositories;

import com.helio.ecom_api_springboot.entities.Product;
import com.helio.ecom_api_springboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


}
