package com.arashi.springbootmall.service;

import com.arashi.springbootmall.dto.ProductQueryParams;
import com.arashi.springbootmall.dto.ProductRequest;
import com.arashi.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
