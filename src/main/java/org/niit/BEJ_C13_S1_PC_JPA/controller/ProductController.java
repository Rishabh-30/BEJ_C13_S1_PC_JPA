package org.niit.BEJ_C13_S1_PC_JPA.controller;

import org.niit.BEJ_C13_S1_PC_JPA.domain.Product;
import org.niit.BEJ_C13_S1_PC_JPA.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2")
public class ProductController {

    public IProductService productService;

    @Autowired
    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/users")
    public ResponseEntity <?> getAllProduct(){
        return new ResponseEntity<>(productService.getAllProduct(), HttpStatus.CREATED);
    }
    @PostMapping("/users")
    public ResponseEntity<?> saveProduct(@RequestBody Product p){
        return new ResponseEntity<>( productService.saveProduct(p), HttpStatus.OK);

    }
    @PutMapping("/users/{productId}")
    public ResponseEntity<?> updateUser(@RequestBody Product p,@PathVariable Integer productId){
         return new ResponseEntity<>( productService.saveProduct(p), HttpStatus.OK);
    }
    @DeleteMapping("/users/{productId}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer productId){
        return new ResponseEntity<>( productService.deleteproduct(productId), HttpStatus.OK);
    }

}
