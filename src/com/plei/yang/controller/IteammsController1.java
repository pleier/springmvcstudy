package com.plei.yang.controller;

import com.plei.yang.pojo.Products;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pleiyang on 2016/12/8.
 */
public class IteammsController1 implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {
        Products products = new Products();
        products.setProdDesc("这是一个很牛逼的商品aa");
        products.setProdId("123456");
        products.setProdName("macbook pro");
        products.setProdPrice(100.0);
        products.setVendId("apple");
        httpServletRequest.setAttribute("products",products);
        httpServletRequest.getRequestDispatcher("listProducts").forward(httpServletRequest,httpServletResponse);
    }
}
