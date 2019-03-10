package com.boot.security.server.service;

import com.boot.security.server.entity.SysRole;
import com.boot.security.server.mapper.SysRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author haodaquan
 * @create 2019-03-02 09:49
 **/
@Service
public class SysRoleService {
    @Autowired
    private SysRoleMapper roleMapper;

    public SysRole selectById(Integer id){
        return roleMapper.selectById(id);
    }

    public SysRole selectByName(String name){
        return roleMapper.selectByName(name);
    }
}