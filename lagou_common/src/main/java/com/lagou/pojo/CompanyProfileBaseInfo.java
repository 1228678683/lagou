package com.lagou.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain=true)
@TableName("company_profile_base_info")
public class CompanyProfileBaseInfo  implements Serializable {
    private static final long serialVersionUID = 4893680833605558808L;
    private String city;

    private String industryField;

    private Double companySize;

    private String companyUrl;
}