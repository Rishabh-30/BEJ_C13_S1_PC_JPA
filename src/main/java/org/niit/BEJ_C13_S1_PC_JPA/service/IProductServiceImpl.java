package org.niit.BEJ_C13_S1_PC_JPA.service;

import org.apache.catalina.User;
import org.niit.BEJ_C13_S1_PC_JPA.domain.Product;
import org.niit.BEJ_C13_S1_PC_JPA.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IProductServiceImpl  implements IProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product p) {
        return productRepository.save(p);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product updateProduct(Product p, Integer productId) {

        Optional<Product> optional = productRepository.findById(productId);
        if (optional.isEmpty()) {
            return null;
        }
        Product result = optional.get();


        if (p.getProductName() != null) {
            result.setProductName(p.getProductName());
        }
        if (p.getProductDescription() != null) {
            result.setProductDescription(p.getProductDescription());
        }


        return productRepository.save(p);

    }

    @Override
    public String deleteproduct(Integer productId) {

        if (productRepository.findById(productId).isEmpty()) {
            return "user not exist";
        } else {
            productRepository.deleteById(productId);
            return "delete successfully";


        }
    }
}