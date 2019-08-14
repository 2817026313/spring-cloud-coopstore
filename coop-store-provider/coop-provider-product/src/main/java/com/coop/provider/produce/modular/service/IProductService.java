package com.coop.provider.produce.modular.service;

import com.coop.model.product.Product;

import java.util.List;

/**
 * @auther 1301913120@qq.com
 * @create 2019-06-11 14:50
 * @todo
 */
public interface IProductService {
    Product get(int id);
    boolean add(Product product);
    List<Product> list();
}
