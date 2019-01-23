package com.lagou.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain=true)
@TableName("company_profile")
public class CompanyProfile implements Serializable {
    private static final long serialVersionUID = -1527139882692575510L;
    private Integer id;

    private Integer companyId;

    private String companyProfile;


}