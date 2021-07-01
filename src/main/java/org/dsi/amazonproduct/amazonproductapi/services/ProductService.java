package org.dsi.amazonproduct.amazonproductapi.services;

import org.dsi.amazonproduct.amazonproductapi.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> fetchAllProducts();
}
