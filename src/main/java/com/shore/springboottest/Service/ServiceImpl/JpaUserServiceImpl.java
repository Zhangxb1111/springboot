package com.shore.springboottest.Service.ServiceImpl;

import com.shore.springboottest.Dao.JpaUserDao;
import com.shore.springboottest.Service.JpaUserServiceI;
import com.shore.springboottest.model.JpaUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JpaUserServiceImpl implements JpaUserServiceI {

    @Autowired
    private JpaUserDao jpaUserDao;
    @Override
    public JpaUser findJpaUserByUserName(String name) {
        return jpaUserDao.findByUserName(name);
    }

    @Override
    public JpaUser save(JpaUser jpaUser) {
        JpaUser save = jpaUserDao.save(jpaUser);
        return save;
    }

    @Override
    public List<JpaUser> findAll() {
        return jpaUserDao.findAll();
    }

    @Override
    public void deleteJpaUserById(Long id) {
        jpaUserDao.delete(id);
    }

    @Override
    public JpaUser updateJpaUser(JpaUser jpaUser) {
        return jpaUserDao.saveAndFlush(jpaUser);
    }

}
