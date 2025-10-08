package com.helio.ecom_api_springboot.repositories;

import com.helio.ecom_api_springboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
