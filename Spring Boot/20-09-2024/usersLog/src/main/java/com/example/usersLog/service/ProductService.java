package com.example.usersLog.service;

import java.util.List;
import com.example.usersLog.entity.Product;

public interface ProductService {

    Product saveProduct(Product product);
    
    List<Product> getAllProducts();
    
    Product getProductById(int id);
    
    Product updateProduct(int id, Product product);
    
    void deleteProductById(int id);
    
}
