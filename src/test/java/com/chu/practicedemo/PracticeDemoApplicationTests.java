package com.chu.practicedemo;

import com.chu.practicedemo.module.User;
import com.chu.practicedemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.UUID;

@SpringBootTest
class PracticeDemoApplicationTests {

    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() {

    }

    @Autowired
    private UserService userService;
    @Test
    public void testAdd(){
        userService.add(new User(1,"alex",18));
    }

    @Test
    public void testSelect(){
        System.out.println(userService.select(1));
    }}
