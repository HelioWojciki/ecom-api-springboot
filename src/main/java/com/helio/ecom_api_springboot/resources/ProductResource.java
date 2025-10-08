package com.helio.ecom_api_springboot.resources;

import com.helio.ecom_api_springboot.entities.Product;
import com.helio.ecom_api_springboot.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService productService;
    
    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> list = productService.findAll();
        return ResponseEntity.ok().body(list);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product obj = productService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
