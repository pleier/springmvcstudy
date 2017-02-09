package com.plei.yang.controller;

import com.plei.yang.pojo.Products;
import com.plei.yang.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by pleiyang on 2016/12/12.
 */
@Controller
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    public ProductsService productsService;



    @RequestMapping(value="/listAll.do",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView listAll() throws Exception{
        ModelAndView mav = new ModelAndView("listProducts");
        List<Products> products = productsService.listAll();
        mav.addObject("products",products);
        return mav;
    }

    @RequestMapping("/edit.do")
    public ModelAndView edit(@RequestParam("proId") String id) throws Exception{
        ModelAndView mav = new ModelAndView("editProducts");

        Products product = productsService.getProductsById(id);
        mav.addObject("product",product);
        return mav;
    }

    @RequestMapping(value="/update.do",method = {RequestMethod.POST})
    public ModelAndView update(Products product) throws Exception{
        ModelAndView modelAndView = new ModelAndView("redirect:listAll.do");
        productsService.updateProducts(product);
        return modelAndView;
    }
}
