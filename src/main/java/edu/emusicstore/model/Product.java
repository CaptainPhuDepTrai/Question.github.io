package edu.emusicstore.model;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Min;

/**
 * Created by damducduy on 18-02-17.
 */
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String productId;

    @NotEmpty(message = "Product ko dc empty")
    private  String productName;
    private String productCategory;
    private String productDecription;

    @Min(value = 0, message = "The product price phai lon hon 0")
    private double productPrice;

    private String productCondition;
    private String productStatus;

    @Min(value = 0, message = "The product in stock phai lon hon 0")
    private int unitInStock;

    private String productManufacturer;

    @Transient
    private MultipartFile productImage;

    public MultipartFile getProductImage() {
        return productImage;
    }



    public Product(){}
    public Product(String productId,String productName, String productCategory, String productDecription, double productPrice, String productCondition, String productStatus, int unitInStock, String productManufacturer) {
        this.productId=productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productDecription = productDecription;
        this.productPrice = productPrice;
        this.productCondition = productCondition;
        this.productStatus = productStatus;
        this.unitInStock = unitInStock;
        this.productManufacturer = productManufacturer;
    }

    public void setProductImage(MultipartFile productImage) {
        this.productImage = productImage;
    }
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDecription() {
        return productDecription;
    }

    public void setProductDecription(String productDecription) {
        this.productDecription = productDecription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }
}
