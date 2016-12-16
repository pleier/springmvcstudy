package com.plei.yang.pojo;

/**
 * @author pleiyang
 *         每个订单中的实际物品
 */
public class OrderItems {
    private Integer orderNum;//订单号
    private Integer orderItems;//订单物品号
    private String prodId;//产品id
    private Integer quantity;//物品数量
    private Double itemPrice;//物品价格

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Integer orderItems) {
        this.orderItems = orderItems;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

}
