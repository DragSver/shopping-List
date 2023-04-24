package com.ulearnProjects.lod.ShoppingList.service;

import com.ulearnProjects.lod.ShoppingList.model.Product;
import com.ulearnProjects.lod.ShoppingList.repository.ProductRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @MockBean
    private ProductRepository productRepository;

    @Test
    public void testAddSucceeds() {
        boolean result = productService.add("product1");
        Assert.assertTrue(result);
        verify(productRepository).save(any(Product.class));
    }

    @Test
    public void testGet() {
        doReturn(Optional.of(new Product())).when(productRepository).findById(1L);
        Product result = productService.get(1L);
        verify(productRepository).findById(1L);
    }

    @Test
    public void testGetAll() {
        productService.getAll();
        verify(productRepository).findAll();
    }

    @Test
    public void testDelete() {
        boolean bl = productService.delete(1L);
        Assert.assertTrue(bl);
        verify(productRepository).deleteById(1L);
    }

    @Test
    public void testCheck() {
        doReturn(Optional.of(new Product("product"))).when(productRepository).findById(1L);
        boolean bl = productService.check(1L);
        Assert.assertTrue(bl);
        verify(productRepository).save(any(Product.class));
    }
}