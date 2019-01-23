package com.lagou.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain=true)
@TableName("company_label")
public class CompanyLabel implements Serializable {
    private static final long serialVersionUID = -8030700996482951575L;
    private Integer id;

    private Integer companyId;

    private String labels;

}