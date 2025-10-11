package com.helio.ecom_api_springboot.services;

import com.helio.ecom_api_springboot.entities.User;
import com.helio.ecom_api_springboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

     public List<User> findAll (){
         return userRepository.findAll();
     }

     public User findById (Long id){
         Optional<User> obj = userRepository.findById(id);
         return obj.get();
     }

     public User insert(User obj){
         return userRepository.save(obj); // direto, pois já retorna o obj salvo
     }

     public void delete(Long id){
         userRepository.deleteById(id);
     }

     public User update(Long id, User obj){
         User entity = userRepository.getReferenceById(id); // prepara o obj
         updateData(entity, obj);
         return userRepository.save(entity);
     }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
