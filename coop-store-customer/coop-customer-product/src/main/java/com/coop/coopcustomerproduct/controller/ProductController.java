package com.coop.coopcustomerproduct.controller;

import com.coop.model.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ProductController {

    public static final String PRODUCT_GET_URL = "http://localhost:4398/product/get/";
    public static final String PRODUCT_LIST_URL="http://localhost:4398/product/list/";
    public static final String PRODUCT_ADD_URL = "http://localhost:4398/product/add/";

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/product/get")
    public Object getProduct(long id) {
        Product product = restTemplate.getForObject(PRODUCT_GET_URL + id, Product.class);
        return  product;
    }

    @RequestMapping("/product/list")
    public  Object listProduct() {
        List<Product> list = restTemplate.getForObject(PRODUCT_LIST_URL, List.class);
        return  list;
    }

    @RequestMapping("/product/add")
    public Object addPorduct(Product product) {
        Boolean result = restTemplate.postForObject(PRODUCT_ADD_URL, product, Boolean.class);
        return  result;
    }
}
