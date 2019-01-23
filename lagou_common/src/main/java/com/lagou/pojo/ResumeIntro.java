package com.lagou.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain=true)
@TableName("resume_intro")
public class ResumeIntro implements Serializable {
    private static final long serialVersionUID = -1572033049898773828L;
    private String myremark;

    public String getMyremark() {
        return myremark;
    }

    public void setMyremark(String myremark) {
        this.myremark = myremark;
    }
}