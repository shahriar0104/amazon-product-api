package org.dsi.amazonproduct.amazonproductapi.controllers;

import org.dsi.amazonproduct.amazonproductapi.model.Product;
import org.dsi.amazonproduct.amazonproductapi.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@CrossOrigin("https://amazon-product-server-db.herokuapp.com")
@RequestMapping("/")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("products")
    public ResponseEntity<List<Product>> getAllProducts(HttpServletRequest request) {
        List<Product> products = productService.fetchAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
