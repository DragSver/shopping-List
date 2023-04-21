package com.ulearnProjects.lod.ShoppingList.controller;

import com.ulearnProjects.lod.ShoppingList.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products", productService.getAll());
        return "list";
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public String doCreate(@ModelAttribute("newProduct") String newProduct) {
        productService.add(newProduct);
        return "redirect:/";
    }
}
