package com.javajap.japsqldemo.controller;

import com.javajap.japsqldemo.dto.ProductDtoGet;
import com.javajap.japsqldemo.dto.ProductDtoPost;
import com.javajap.japsqldemo.entity.Product;
import com.javajap.japsqldemo.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/product")
    public ProductDtoPost addProduct(@Valid @RequestBody Product product){
        Product product1 = productService.saveProduct(product);
        return modelMapper.map(product1, ProductDtoPost.class);
    }

    @PostMapping("/products")
    public List<ProductDtoPost> addProducts(@RequestBody List<Product> products){
        //return productService.saveProduct(products);
        return productService.saveProduct(products).stream()
                .map(product -> modelMapper.map(product, ProductDtoPost.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/products")
    public List<ProductDtoGet> getProducts(){
        return productService.getProducts().stream()
                .map(product -> modelMapper.map(product, ProductDtoGet.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/productById/{id}")
    public ProductDtoGet getProductById(@PathVariable int id){
        Product product = productService.getProductById(id);
        return modelMapper.map(product, ProductDtoGet.class);
    }

    @GetMapping("/productByName/{name}")
    public Product getProductByName(@PathVariable String name){
        return productService.getProductByName(name);
    }

    @DeleteMapping("/product/{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }

    @PutMapping("/product")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }
}
