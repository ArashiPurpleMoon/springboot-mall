package com.arashi.springbootmall.service.impl;

import com.arashi.springbootmall.dao.ProductDao;
import com.arashi.springbootmall.model.Product;
import com.arashi.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
