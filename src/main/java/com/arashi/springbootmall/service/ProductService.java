package com.arashi.springbootmall.service;

import com.arashi.springbootmall.dto.ProductRequest;
import com.arashi.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
