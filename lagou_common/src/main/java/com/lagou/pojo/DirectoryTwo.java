package com.lagou.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain=true)
@TableName("directory_two")
public class DirectoryTwo implements Serializable {
    private static final long serialVersionUID = -5886318830304653348L;
    private String name;
}