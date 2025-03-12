package com.arashi.springbootmall.dao;

import com.arashi.springbootmall.constant.ProductCategory;
import com.arashi.springbootmall.dto.ProductRequest;
import com.arashi.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
