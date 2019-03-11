package com.boot.security.server.mapper;

import com.boot.security.server.entity.SysPermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author haodaquan
 * @create 2019-03-03 14:05
 **/
@Mapper
public interface SysPermissionMapper {
    @Select("SELECT * FROM sys_permission WHERE role_id=#{roleId}")
    List<SysPermission> listByRoleId(Integer roleId);

//    // This example creates a prepared statement, something like select * from teacher where name = ?;
//    @Select("Select * from teacher where name = #{name}")
//    Teacher selectTeachForGivenName(@Param("name") String name);
//
//    // This example creates n inlined statement, something like select * from teacher where name = 'someName';
//    @Select("Select * from teacher where name = '${name}'")
//    Teacher selectTeachForGivenName(@Param("name") String name);
}
