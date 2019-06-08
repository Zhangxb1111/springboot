package com.shore.springboottest.controller;

import com.shore.springboottest.model.Company;
import com.shore.springboottest.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/testCtl")
public class RestController {


    @Autowired
    private User user;
    @Autowired
    private Company company;

    @Value("${shore.name}")
    private String name;

    @ApiOperation(value = "测试properties文件",notes = "测试properties文件")
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public  String test(){
        return this.name+"||"+user.toString()+"||"+company.toString();
    }
}
