package com.example.usersLog.controller;

import com.example.usersLog.entity.Product;
import com.example.usersLog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
	/*
	 * @GetMapping public List<Product> getAllProducts() { return
	 * productService.getAllProducts(); }
	 * 
	 * @GetMapping("/{id}") public Product getProductById(@PathVariable Long id) {
	 * Optional<Product> product = productService.getProductById(id); return
	 * product.orElse(null); // Return null if not found; consider returning a
	 * different status or message in production }
	 * 
	 * @PutMapping("/{id}") public Product updateProduct(@PathVariable Long
	 * id, @RequestBody Product product) { return productService.updateProduct(id,
	 * product); }
	 * 
	 * @DeleteMapping("/{id}") public void deleteProduct(@PathVariable Long id) {
	 * productService.deleteProduct(id); }
	 */
}
