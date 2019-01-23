package com.lagou.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
@Data
@Accessors(chain=true)
@TableName("company_position")
public class CompanyPosition implements Serializable {
    private static final long serialVersionUID = -4901676404316904601L;
    private String positionType;

    private String positionName;

    private String department;

    private String jobJature;

    private String salaryMin;

    private String salaryMax;

    private String workAddress;

    private String workYear;

    private String city;

    private String education;

    private String positionAdvantage;

    private String positionDetail;

    private String positionAddress;

    private String positionLng;

    private String positionLat;

    private String email;

    private String forwardEmail;

    private Integer status;

    private Integer click;

    private Integer succeedSuccessful;

    private Integer defeatedSuccessful;

    private Date updatetime;


}