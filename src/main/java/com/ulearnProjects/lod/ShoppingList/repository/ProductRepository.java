package com.ulearnProjects.lod.ShoppingList.repository;

import com.ulearnProjects.lod.ShoppingList.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}