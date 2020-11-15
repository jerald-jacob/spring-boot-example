/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.springCRUD;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jerald
 */
@Service
public class productService {
    @Autowired
    private ProductRepository repo;
    public List<Product> listall(){
        return repo.findAll();
    }
    public void save (Product product){
        repo.save(product);
    }
    public Product get(Long id){
        return repo.findById(id).get();
    }
    public void delete(Long id){
        repo.deleteById(id);
        
    }
}
