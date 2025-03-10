package com.arashi.springbootmall.dao;

import com.arashi.springbootmall.dto.ProductRequest;
import com.arashi.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
