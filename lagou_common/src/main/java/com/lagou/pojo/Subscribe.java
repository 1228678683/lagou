package com.lagou.pojo;

import java.math.BigDecimal;

public class Subscribe extends SubscribeKey {
    private String sendmailper;

    private String email;

    private String city;

    private String financestage;

    private String industryfield;

    private String positionname;

    private BigDecimal salary;

    public String getSendmailper() {
        return sendmailper;
    }

    public void setSendmailper(String sendmailper) {
        this.sendmailper = sendmailper;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFinancestage() {
        return financestage;
    }

    public void setFinancestage(String financestage) {
        this.financestage = financestage;
    }

    public String getIndustryfield() {
        return industryfield;
    }

    public void setIndustryfield(String industryfield) {
        this.industryfield = industryfield;
    }

    public String getPositionname() {
        return positionname;
    }

    public void setPositionname(String positionname) {
        this.positionname = positionname;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}