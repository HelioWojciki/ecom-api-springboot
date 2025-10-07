package com.helio.ecom_api_springboot.resources;

import com.helio.ecom_api_springboot.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "José", "Jose@gmail.com","42991229998" , "tigre");

        return ResponseEntity.ok().body(u);
    }
}
