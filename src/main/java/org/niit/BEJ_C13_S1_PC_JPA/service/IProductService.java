package org.niit.BEJ_C13_S1_PC_JPA.service;

import org.niit.BEJ_C13_S1_PC_JPA.domain.Product;

import java.util.List;

public interface IProductService {


    public Product saveProduct(Product p);
    public List <Product> getAllProduct();

    public Product updateProduct(Product p,Integer productId);

    public String deleteproduct(Integer productId);

}
