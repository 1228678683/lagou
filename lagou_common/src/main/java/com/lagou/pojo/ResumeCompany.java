package com.lagou.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain=true)
@TableName("resume_company")
public class ResumeCompany implements Serializable {
    private static final long serialVersionUID = 8790452334805198698L;
    private Integer status;

    private Integer transpond;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTranspond() {
        return transpond;
    }

    public void setTranspond(Integer transpond) {
        this.transpond = transpond;
    }
}