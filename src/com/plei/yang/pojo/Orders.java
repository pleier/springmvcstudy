package com.plei.yang.pojo;

import java.util.Date;

/**
 * @author pleiyang
 *         顾客订单
 */
public class Orders {
    private Integer orderNum;//唯一的订单号
    private Date orderDate;//订单日期
    private String custId;//订单顾客id


    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

}
