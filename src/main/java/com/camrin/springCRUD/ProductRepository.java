/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.springCRUD;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jerald
 */
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
