package com.shore.springboottest.Service;

import com.shore.springboottest.model.JpaUser;

import java.util.List;

public interface JpaUserServiceI {

    /**
     * 根据用户名查找用户
     * @param name 用户名
     * @return
     */
    JpaUser findJpaUserByUserName(String name);

    /**
     * 创建用户
     * @param jpaUser
     * @return
     */
    JpaUser save(JpaUser jpaUser);

    /**
     * 获取用户列表
     * @return
     */
    List<JpaUser> findAll();

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    void deleteJpaUserById(Long id);

    /**
     * 更新用户信息
     * @param jpaUser
     * @return
     */
    JpaUser updateJpaUser(JpaUser jpaUser);
}
