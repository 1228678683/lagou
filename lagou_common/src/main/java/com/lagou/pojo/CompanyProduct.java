package com.lagou.pojo;

public class CompanyProduct extends CompanyProductKey {
    private String type;

    private String productPicUrl;

    private String product;

    private String productUrl;

    private String productProfile;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProductPicUrl() {
        return productPicUrl;
    }

    public void setProductPicUrl(String productPicUrl) {
        this.productPicUrl = productPicUrl;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getProductProfile() {
        return productProfile;
    }

    public void setProductProfile(String productProfile) {
        this.productProfile = productProfile;
    }
}