package edu.emusicstore.dao;

import edu.emusicstore.model.Product;
import edu.emusicstore.model.ProductBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface ProductDao {

    void addProduct(Product product);
    public List<Product> getProductList();
    public Product getProductById(String id);
    void editProduct(Product product);
    void deleteProduct(String id);
}
