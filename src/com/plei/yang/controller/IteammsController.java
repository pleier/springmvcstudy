package com.plei.yang.controller;

import com.plei.yang.pojo.Products;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by pleiyang on 2016/12/8.
 */
public class IteammsController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws Exception {
        Products products = new Products();
        products.setProdDesc("这是一个很牛逼的商品");
        products.setProdId("123456");
        products.setProdName("macbook pro");
        products.setProdPrice(100.0);
        products.setVendId("apple");
        ModelAndView mav = new ModelAndView("listProducts");
        mav.addObject("products",products);
        return mav;
    }
}
