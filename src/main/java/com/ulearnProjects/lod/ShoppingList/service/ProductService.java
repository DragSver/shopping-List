package com.ulearnProjects.lod.ShoppingList.service;

import com.ulearnProjects.lod.ShoppingList.model.Product;
import com.ulearnProjects.lod.ShoppingList.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void add(String product) {
        productRepository.save(new Product(product));
    }

    public Product get(Long id){
        return productRepository.findById(id).get();
    }

    public Iterable<Product> getAll() {
        return productRepository.findAll();
    }

    public void delete(Long id){
        productRepository.deleteById(id);
    }

    public void check(Long id){
        Product product = get(id);
        product.checked();
        productRepository.save(product);
    }
}
