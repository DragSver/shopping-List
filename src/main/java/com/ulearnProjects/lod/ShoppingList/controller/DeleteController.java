package com.ulearnProjects.lod.ShoppingList.controller;

import com.ulearnProjects.lod.ShoppingList.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DeleteController {
    @Autowired
    ProductService productService;


    @ResponseBody
    @RequestMapping(path = "/delete={id}", method = RequestMethod.POST)
    public String delete(@PathVariable("id") Long id){
        productService.delete(id);
        return "redirect:/";
    }
}
