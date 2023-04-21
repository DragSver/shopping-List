package com.ulearnProjects.lod.ShoppingList.controller;

import com.ulearnProjects.lod.ShoppingList.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CheckedController {

    @Autowired
    ProductService productService;

    @ResponseBody
    @RequestMapping(path = "/checked={id}", method = RequestMethod.POST)
    public String check(@PathVariable("id") Long id){
        productService.check(id);
        return "redirect:/";
    }
}