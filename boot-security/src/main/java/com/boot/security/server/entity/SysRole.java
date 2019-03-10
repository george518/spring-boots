package com.boot.security.server.entity;

import java.io.Serializable;

/**
 * @author haodaquan
 * @create 2019-03-02 08:39
 **/
public class SysRole implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
