package com.helio.ecom_api_springboot.repositories;

import com.helio.ecom_api_springboot.entities.Category;
import com.helio.ecom_api_springboot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
