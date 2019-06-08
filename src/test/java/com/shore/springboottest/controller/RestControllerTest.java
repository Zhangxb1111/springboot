package com.shore.springboottest.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.HttpServletRequest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestControllerTest {

    @Autowired
    private HttpServletRequest request;

    @Before
    public void setUp() throws Exception {
        System.out.println("test start.......");
    }

    @Test
    public void test1() {
        System.out.println("testing........");
        request.getRequestDispatcher("/testCtl/test");
    }
}