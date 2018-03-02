package com.kaka.users.dao;

import com.kaka.users.model.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author wuwanggao@pinming.cn
 * @dete 2018-3-2
 */
@Repository
public interface UserRepository extends JpaRepository<SysUser, Long> {

}
