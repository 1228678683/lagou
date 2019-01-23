package com.lagou.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain=true)
@TableName("resume_education_experience")
public class ResumeEducationExperience implements Serializable {
    private static final long serialVersionUID = 1558304070203633376L;
    private String schoolName;

    private String education;

    private String professional;

    private Integer startYear;

    private Integer endyear;

    private Integer eduid;


}