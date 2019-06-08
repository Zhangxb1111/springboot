package com.shore.springboottest.Dao;

import com.shore.springboottest.model.JpaUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserDao extends JpaRepository<JpaUser,Long> {

    JpaUser findByUserName(String userName);

}
