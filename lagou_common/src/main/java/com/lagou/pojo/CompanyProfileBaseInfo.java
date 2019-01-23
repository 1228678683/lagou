package com.lagou.pojo;

public class CompanyProfileBaseInfo extends CompanyProfileBaseInfoKey {
    private String city;

    private String industryField;

    private Double companySize;

    private String companyUrl;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIndustryField() {
        return industryField;
    }

    public void setIndustryField(String industryField) {
        this.industryField = industryField;
    }

    public Double getCompanySize() {
        return companySize;
    }

    public void setCompanySize(Double companySize) {
        this.companySize = companySize;
    }

    public String getCompanyUrl() {
        return companyUrl;
    }

    public void setCompanyUrl(String companyUrl) {
        this.companyUrl = companyUrl;
    }
}