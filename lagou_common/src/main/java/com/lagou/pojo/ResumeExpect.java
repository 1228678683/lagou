package com.lagou.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain=true)
@TableName("resume_expect")
public class ResumeExpect implements Serializable {
    private static final long serialVersionUID = -2725061952393395971L;
    private String city;

    private String positionType;

    private String positionName;

    private String salarys;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPositionType() {
        return positionType;
    }

    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getSalarys() {
        return salarys;
    }

    public void setSalarys(String salarys) {
        this.salarys = salarys;
    }
}