package com.arashi.springbootmall.dao;

import com.arashi.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
