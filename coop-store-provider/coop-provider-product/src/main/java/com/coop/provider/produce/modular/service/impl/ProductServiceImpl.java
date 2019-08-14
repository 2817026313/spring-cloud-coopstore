package com.coop.provider.produce.modular.service.impl;

import com.coop.model.product.Product;
import com.coop.provider.produce.modular.mapper.ProductMapper;
import com.coop.provider.produce.modular.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @auther 1301913120@qq.com
 * @create 2019-06-11 15:22
 * @todo
 */


@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product get(int id) {
        return productMapper.findById(id);
    }

    @Override
    public boolean add(Product product) {
        return productMapper.create(product);
    }

    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }
}