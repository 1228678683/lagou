package com.lagou.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain=true)
@TableName("company_product")
public class CompanyProduct implements Serializable {
    private static final long serialVersionUID = 1200032736123540488L;
    private String type;

    private String productPicUrl;

    private String product;

    private String productUrl;

    private String productProfile;


}