package edu.emusicstore.model;

public class ProductBuilder {
    private String productId;
    private String productName;
    private String productCategory;
    private String productDecription;
    private double productPrice;
    private String productCondition;
    private String productStatus;
    private int unitInStock;
    private String productManufacturer;

    public ProductBuilder setProuductId(String prouductId) {
        this.productId = prouductId;
        return this;
    }

    public ProductBuilder setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public ProductBuilder setProductCategory(String productCategory) {
        this.productCategory = productCategory;
        return this;
    }

    public ProductBuilder setProductDecription(String productDecription) {
        this.productDecription = productDecription;
        return this;
    }

    public ProductBuilder setProductPrice(double productPrice) {
        this.productPrice = productPrice;
        return this;
    }

    public ProductBuilder setProductCondition(String productCondition) {
        this.productCondition = productCondition;
        return this;
    }

    public ProductBuilder setProductStatus(String productStatus) {
        this.productStatus = productStatus;
        return this;
    }

    public ProductBuilder setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
        return this;
    }

    public ProductBuilder setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
        return this;
    }

    public Product createProduct() {
        return new Product(productId,productName, productCategory, productDecription, productPrice, productCondition, productStatus, unitInStock, productManufacturer);
    }
}