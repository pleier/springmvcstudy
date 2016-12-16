package com.plei.yang.service.impl;

import com.plei.yang.mapper.ProductsMapper;
import com.plei.yang.pojo.Products;
import com.plei.yang.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by pleiyang on 2016/12/12.
 */
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsMapper productsMapper;

    @Override
    public List<Products> listAll() throws Exception {
        return productsMapper.listAll();
    }

    @Override
    public Products getProductsById(String proId) throws Exception{
        return productsMapper.getProductsById(proId);
    }
}
