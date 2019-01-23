package com.lagou.pojo;

public class CompanyStage {
    private Integer id;

    private String financestage;

    private String stages;

    private Integer companyId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFinancestage() {
        return financestage;
    }

    public void setFinancestage(String financestage) {
        this.financestage = financestage;
    }

    public String getStages() {
        return stages;
    }

    public void setStages(String stages) {
        this.stages = stages;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}