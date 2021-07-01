package org.dsi.amazonproduct.amazonproductapi.model;

public class Product {

    private Integer id;
    private String name;
    private Double price;
    private String image;
    private String product_url;

    public Product(Integer id, String name, Double price, String image, String product_url) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
        this.product_url = product_url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getProduct_url() {
        return product_url;
    }

    public void setProduct_url(String product_url) {
        this.product_url = product_url;
    }
}
