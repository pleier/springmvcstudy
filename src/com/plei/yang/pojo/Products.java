package com.plei.yang.pojo;

import java.io.Serializable;

/**
 * 
 * @author pleiyang
 *产品明细
 */
public class Products implements Serializable{
	private String prodId;//唯一的产品id
	private String vendId;//产品供应商id
	private String prodName;//产品名称
	private Double prodPrice;//产品价格
	private String prodDesc;//产品描述
	
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getVendId() {
		return vendId;
	}
	public void setVendId(String vendId) {
		this.vendId = vendId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public void setProdPrice(Double prodPrice) {
		this.prodPrice = prodPrice;
	}

	
}
