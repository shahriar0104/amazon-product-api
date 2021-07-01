package org.dsi.amazonproduct.amazonproductapi.services;

import org.dsi.amazonproduct.amazonproductapi.model.Product;
import org.dsi.amazonproduct.amazonproductapi.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImp implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> fetchAllProducts() {
        return productRepository.findAll();
    }
}
