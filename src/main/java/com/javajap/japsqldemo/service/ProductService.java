package com.javajap.japsqldemo.service;

import com.javajap.japsqldemo.entity.Product;
import com.javajap.japsqldemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> saveProduct(List<Product> products){
        return productRepository.saveAll(products);
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
//        if (productList.size() == 0){
//            return new ArrayList<>();
//        }else {
//            return productRepository.findAll();
//        }
    }

    public Product getProductById(int id){
        return productRepository.findById(id).orElse(null);
    }

    public Product getProductByName(String name){
        return productRepository.findByName(name);
    }

    public String deleteProduct(int id){
        productRepository.deleteById(id);
        return "Object Deleted "+id;
    }

    public Product updateProduct(Product product){
        return productRepository.save(product);
    }



}
