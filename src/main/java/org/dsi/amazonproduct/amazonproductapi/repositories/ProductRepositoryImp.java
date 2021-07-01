package org.dsi.amazonproduct.amazonproductapi.repositories;

import org.dsi.amazonproduct.amazonproductapi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepositoryImp implements ProductRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;

    private static final String SQL_FIND_ALL = "SELECT * FROM product";

    @Override
    public List<Product> findAll() {
        return jdbcTemplate.query(SQL_FIND_ALL, new Object[]{}, productRowMapper);
    }

    private RowMapper<Product> productRowMapper = ((rs, rowNum) -> new Product(rs.getInt("id"),
            rs.getString("name"),
            rs.getDouble("price"),
            rs.getString("image"),
            rs.getString("product_url")));
}
