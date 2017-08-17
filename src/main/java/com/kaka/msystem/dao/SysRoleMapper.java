package com.kaka.msystem.dao;


import com.kaka.msystem.model.SysRole;
import org.apache.ibatis.annotations.Param;

import java.util.Set;

/**
 * 系统角色类Dao
 * Created by QIEGAO on 2017/8/1.
 */

public interface SysRoleDaoMapper {



    /**
     * 根据用户id查找角色信息并装配
     *
     * @param id
     * @return
     */
    Set<SysRole> findByUserId(@Param("id") Long id);
}
