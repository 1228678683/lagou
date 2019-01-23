package com.lagou.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain=true)
@TableName("subscribe_quantity")
public class SubscribeQuantity implements Serializable {
    private static final long serialVersionUID = -3469514299938241788L;
    private Integer id;

    private Integer subscribeQuantity;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSubscribeQuantity() {
        return subscribeQuantity;
    }

    public void setSubscribeQuantity(Integer subscribeQuantity) {
        this.subscribeQuantity = subscribeQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}