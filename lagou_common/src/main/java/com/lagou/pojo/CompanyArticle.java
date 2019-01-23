package com.lagou.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
@Data
@Accessors(chain=true)
@TableName("company_article")
public class CompanyArticle  implements Serializable {
    private static final long serialVersionUID = -4460236806616985364L;
    private String title;

    private String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}