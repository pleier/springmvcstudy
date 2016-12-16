package com.plei.yang.mapper;

import com.plei.yang.pojo.Products;

import java.util.List;

/**
 * Created by pleiyang on 2016/12/12.
 */
public interface ProductsMapper {
    public List<Products> listAll() throws Exception;
    public Products getProductsById(String proId) throws Exception;
    public void updateProducts(Products products) throws Exception;
}
