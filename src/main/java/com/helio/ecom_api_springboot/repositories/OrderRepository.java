package com.helio.ecom_api_springboot.repositories;

import com.helio.ecom_api_springboot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
