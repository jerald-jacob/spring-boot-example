/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.springCRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import java.util.List;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author jerald
 */
@Controller
public class AppController {
    @Autowired
    private productService service;
    
    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<Product> listproducts =service.listall();
        model.addAttribute("listproducts",listproducts);
    
        return "index";
}
    @RequestMapping("/new")
    public String showNewProductForm(Model model){
        Product product =new Product();
        model.addAttribute("product",product);
        return "new";
        
    }
    
    @RequestMapping(value="/save",method = RequestMethod.POST)            
    public String saveProduct(@ModelAttribute("product") Product product){
        service.save(product);
        return "redirect:/";
    }
}
