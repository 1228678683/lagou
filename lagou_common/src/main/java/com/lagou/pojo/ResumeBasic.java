package com.lagou.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
@Data
@Accessors(chain=true)
@TableName("resume_basic")
public class ResumeBasic implements Serializable {
    private static final long serialVersionUID = 5753611018016485051L;
    private String name;

    private String sex;

    private String highestEducation;

    private String workYear;

    private String status;

    private String email;

    private String phone;

    private String type;

    private Date updatetime;


}