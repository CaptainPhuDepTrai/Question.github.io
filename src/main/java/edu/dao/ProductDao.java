package edu.dao;

import edu.emusic.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tuanp on 18-Feb-17.
 */
public interface ProductDao {

    void addProduct(Product product);
    List<Product> getProductList();
    Product getProductById(String productId);
    void editProduct(Product product);
    void deleteProduct(String id);

}
