package com.plei.yang.service;

import com.plei.yang.pojo.Products;

import java.util.List;

/**
 * Created by pleiyang on 2016/12/12.
 */
public interface ProductsService {
    //查询所有的商品
    public List<Products> listAll() throws Exception;
    public Products getProductsById(String proId) throws Exception;
}
