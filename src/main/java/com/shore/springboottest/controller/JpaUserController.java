package com.shore.springboottest.controller;

import com.alibaba.fastjson.JSONObject;
import com.shore.springboottest.Service.JpaUserServiceI;
import com.shore.springboottest.model.JpaUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
@RequestMapping(value = "/jpaUserCtl")
public class JpaUserController {

    @Autowired
    private JpaUserServiceI jpaUserServiceI;

    @ApiOperation(value = "获取用户信息",notes = "根据用户名获取用户")
    @RequestMapping(value = "/findJpaUserByName/{JpaUserName}",method = RequestMethod.GET)
    @ResponseBody
    public JpaUser fingJpaUserByName(@PathVariable(name = "JpaUserName") String name){
        JpaUser jpaUser = jpaUserServiceI.findJpaUserByUserName(name);
        return jpaUser;
    }

    @ApiOperation(value = "创建用户",notes = "创建新用户")
    @RequestMapping(value = "/saveJpaUser",method = RequestMethod.GET)
    @ResponseBody
    public JpaUser saveJpaUser(@RequestParam(value = "userName") String userName,@RequestParam(value = "userPwd") String userPwd){
        JpaUser jpaUser = new JpaUser();
        jpaUser.setUserName(userName);
        jpaUser.setPassword(userPwd);
        JpaUser saveJpaUser = jpaUserServiceI.save(jpaUser);
        if (null != jpaUser) return saveJpaUser;
        return null;
    }

    @ApiOperation(value = "用户列表",notes = "用户列表")
    @RequestMapping(value = "/findAllJpaUser",method = RequestMethod.GET)
    @ResponseBody
    public List<JpaUser> getJpaUsers(){
        return jpaUserServiceI.findAll();
    }

    @ApiOperation(value = "删除用户",notes = "删除用户")
    @RequestMapping(value = "/delJpaUserById",method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteJpaUserById(@RequestParam(value = "id") Long id){
        jpaUserServiceI.deleteJpaUserById(id);
    }
    @ApiOperation(value = "更新用户",notes = "更新用户")
    @RequestMapping(value = "/updateJpaUserById/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public JpaUser updateJpaUser(@PathParam(value = "id") Long id,@RequestBody JpaUser jpaUser){
        if (null == jpaUser) return null;
        JpaUser jpaUser1 = new JpaUser();
        jpaUser1.setUserName(jpaUser.getUserName());
        jpaUser1.setPassword(jpaUser.getPassword());
        jpaUser1.setId(jpaUser.getId());
        JpaUser updateJpaUser = jpaUserServiceI.updateJpaUser(jpaUser1);
        return updateJpaUser;
    }

}
