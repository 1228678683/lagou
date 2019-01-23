package com.lagou.pojo;

import java.util.Date;

public class CompanyBasic extends CompanyBasicKey {
    private String companyshortname;

    private String companyfeatures;

    private Integer status;

    private Integer successfulNumber;

    private Date datatime;

    public String getCompanyshortname() {
        return companyshortname;
    }

    public void setCompanyshortname(String companyshortname) {
        this.companyshortname = companyshortname;
    }

    public String getCompanyfeatures() {
        return companyfeatures;
    }

    public void setCompanyfeatures(String companyfeatures) {
        this.companyfeatures = companyfeatures;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSuccessfulNumber() {
        return successfulNumber;
    }

    public void setSuccessfulNumber(Integer successfulNumber) {
        this.successfulNumber = successfulNumber;
    }

    public Date getDatatime() {
        return datatime;
    }

    public void setDatatime(Date datatime) {
        this.datatime = datatime;
    }
}