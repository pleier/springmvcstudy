package com.plei.yang.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @author pleiyang
 *         供应商
 */
public class Vendors implements Serializable{

    private String vendId;//唯一的供应商id
    private String vendName;//供应商名称
    private String vendAdderss;//供应商地址
    private String vendCity;//供应商所在城市
    private String vendSate;//供应商所在州
    private String vendZip;//供应商地址邮政编码
    private String vendCountry;//供应商所在国家

    public String getVendId() {
        return vendId;
    }

    public void setVendId(String vendId) {
        this.vendId = vendId;
    }

    public String getVendName() {
        return vendName;
    }

    public void setVendName(String vendName) {
        this.vendName = vendName;
    }

    public String getVendAdderss() {
        return vendAdderss;
    }

    public void setVendAdderss(String vendAdderss) {
        this.vendAdderss = vendAdderss;
    }

    public String getVendCity() {
        return vendCity;
    }

    public void setVendCity(String vendCity) {
        this.vendCity = vendCity;
    }

    public String getVendSate() {
        return vendSate;
    }

    public void setVendSate(String vendSate) {
        this.vendSate = vendSate;
    }

    public String getVendZip() {
        return vendZip;
    }

    public void setVendZip(String vendZip) {
        this.vendZip = vendZip;
    }

    public String getVendCountry() {
        return vendCountry;
    }

    public void setVendCountry(String vendCountry) {
        this.vendCountry = vendCountry;
    }


}
