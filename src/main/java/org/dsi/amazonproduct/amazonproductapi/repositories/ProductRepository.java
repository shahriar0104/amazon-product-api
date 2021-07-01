package org.dsi.amazonproduct.amazonproductapi.repositories;

import org.dsi.amazonproduct.amazonproductapi.model.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
}
