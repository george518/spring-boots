package com.boot.security.server.entity;

import java.io.Serializable;

/**
 * @author haodaquan
 * @create 2019-03-02 08:40
 **/
public class SysUserRole implements Serializable{

    static final long serialVersionUID = 1L;

    private Integer userId;
    private Integer roleId;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
