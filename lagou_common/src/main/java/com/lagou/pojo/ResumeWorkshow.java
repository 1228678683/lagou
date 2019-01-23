package com.lagou.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain=true)
@TableName("resume_workshow")
public class ResumeWorkshow implements Serializable {
    private static final long serialVersionUID = 6127442499442564082L;
    private String url;

    private String workname;

    private Integer wsid;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname;
    }

    public Integer getWsid() {
        return wsid;
    }

    public void setWsid(Integer wsid) {
        this.wsid = wsid;
    }
}