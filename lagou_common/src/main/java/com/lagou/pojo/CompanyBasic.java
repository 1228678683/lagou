package com.lagou.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
@Data
@Accessors(chain=true)
@TableName("company_basic")
public class CompanyBasic  implements Serializable {

    private static final long serialVersionUID = -4748585189716765804L;
    private String companyshortname;

    private String companyfeatures;

    private Integer status;

    private Integer successfulNumber;

    private Date datatime;
}