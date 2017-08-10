package com.kaka.system.service;

import com.kaka.system.model.SysUser;
import org.springframework.stereotype.Service;

/**
 * Created by QIEGAO on 2017/8/10.
 */
@Service
public interface SysUserService {
    /**
     * 查找用户
     *
     * @param username
     */
    SysUser findUserByUserName(String username);
}
