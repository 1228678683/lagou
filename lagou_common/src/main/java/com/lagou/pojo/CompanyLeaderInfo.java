package com.lagou.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain=true)
@TableName("company_label")
public class CompanyLeaderInfo implements Serializable {
    private static final long serialVersionUID = -5045916059186487587L;
    private String photo;

    private String name;

    private String position;

    private String weibo;

    private String remark;
}