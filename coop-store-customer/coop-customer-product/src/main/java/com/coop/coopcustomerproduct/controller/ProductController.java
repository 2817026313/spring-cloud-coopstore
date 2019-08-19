package com.coop.coopcustomerproduct.controller;

import com.coop.model.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class ProductController {

    public static final String COOP_PROVIDER_PRODUCT = "COOP-PROVIDER-PRODUCT";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/product/get/{id}",produces = "application/json")
    public Object getProduct(@PathVariable("id") int id) {
        Product product = restTemplate.getForObject("http://"+COOP_PROVIDER_PRODUCT+"/product/get/" + id, Product.class);
        return  product;
    }

    @RequestMapping(value = "/product/list", produces = "application/json")
    public  Object listProduct() {
        List<Product> list = restTemplate.getForObject("http://"+COOP_PROVIDER_PRODUCT+"/product/list/", List.class);
        return  list;
    }

    @RequestMapping("/product/add")
    public Object addProduct(Product product) {
        Boolean result = restTemplate.postForObject("http://"+COOP_PROVIDER_PRODUCT+"/product/add/", product, Boolean.class);
        return  result;
    }
}
