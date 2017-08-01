package com.kaka.dao;

import com.kaka.model.SysMenu;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by QIEGAO on 2017/7/30.
 */
public interface SysPermissionDao {
    /**
     * 根据系统用户id查找权限
     *
     * @return
     */
//    @Select(" select p.* from Sys_User u LEFT JOIN sys_role_user sru on u.id= sru.Sys_User_id\n" +
//            "LEFT JOIN Sys_Role r on sru.Sys_Role_id=r.id LEFT JOIN Sys_permission_role spr on spr.role_id=r.id\n" +
//            "LEFT JOIN Sys_permission p on p.id =spr.permission_id where u.id=#{userId}")
//    List<SysMenu> findByAdminUserId(Long userId);
//
    List<SysMenu> findAll();
}
