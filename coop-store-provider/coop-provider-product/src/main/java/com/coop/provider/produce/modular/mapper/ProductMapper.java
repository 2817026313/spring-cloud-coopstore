package com.coop.provider.produce.modular.mapper;

import com.coop.model.product.Product;

import java.util.List;

/**
 * @auther 1301913120@qq.com
 * @create 2019-06-20 14:56
 * @todo
 */
public interface ProductMapper {
    boolean create(Product product);
    Product findById(int id);
    List<Product> findAll();
}