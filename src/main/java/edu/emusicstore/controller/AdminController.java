package edu.emusicstore.controller;

import edu.emusicstore.dao.ProductDao;
import edu.emusicstore.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Controller
public class AdminController {
    private Path path;

    @Autowired
    private ProductDao productDao;

    @RequestMapping(value="/admin/addProduct")
    public String addProduct(Model model){
        //set default values for some fields
        Product product=new Product();
        product.setProductCategory("Instrument");
        product.setProductCondition("New");
        product.setProductStatus("Active");
        model.addAttribute(product);
        return "addProduct";
    }

    @RequestMapping(value="/admin/addProduct",method = RequestMethod.POST)
    public String addProductPost(@Valid @ModelAttribute("product") Product product, BindingResult bindingResult,
                                 HttpServletRequest request){
        if(bindingResult.hasErrors()){
            return "addProduct";
        }
        productDao.addProduct(product); //productID is generated

        //use productId as the image name
        MultipartFile multipartFile = product.getProductImage();
        String rootDir = request.getSession().getServletContext().getRealPath("/");
        path= Paths.get(rootDir+"\\WEB-INF\\resources\\images\\" + product.getProductId()+".png");

        if(path != null && !multipartFile.isEmpty()){
            try {
                multipartFile.transferTo(new File(path.toString())); //save
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return "redirect:/admin/productInventory";
    }

    @RequestMapping(value = "/admin/deleteProduct/{productId}")
    public String deleteProduct(@PathVariable String productId, HttpServletRequest request){


        String rootDir = request.getSession().getServletContext().getRealPath("/");
        path= Paths.get(rootDir+"\\WEB-INF\\resources\\images\\" + productId+".png");

        if(Files.exists(path)){
            try {
                Files.delete(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        productDao.deleteProduct(productId);
        return "redirect:/admin/productInventory";
    }


    @RequestMapping(value = "/admin/editProduct/{productId}")
    public String editProduct(@PathVariable String productId, Model model){
        Product product = productDao.getProductById(productId);
        model.addAttribute(product);
        return "editProduct";
    }

    @RequestMapping(value="/admin/editProduct",method = RequestMethod.POST)
    public String editProductPost(@Valid @ModelAttribute("product") Product product, BindingResult bindingResult,
                                  HttpServletRequest request){
        if(bindingResult.hasErrors()){
            return "editProduct";
        }
        productDao.editProduct(product); //productID is generated

        //use productId as the image name
        MultipartFile multipartFile = product.getProductImage();
        String rootDir = request.getSession().getServletContext().getRealPath("/");
        path= Paths.get(rootDir+"\\WEB-INF\\resources\\images\\" + product.getProductId()+".png");

        if(path != null && !multipartFile.isEmpty()){
            try {
                multipartFile.transferTo(new File(path.toString())); //save
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return "redirect:/admin/productInventory";
    }
    private void addProductListAttribute(Model model){
        List<Product> productList =productDao.getProductList();

        model.addAttribute(productList);
    }


}
