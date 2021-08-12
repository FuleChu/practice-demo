package com.chu.practicedemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chu.practicedemo.dao.UserMapper;
import com.chu.practicedemo.module.User;
import com.chu.practicedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: chufule
 * @time: 2021/3/29 21:54
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public void add(User user) {
        this.userMapper.insert(user);
    }

    @Override
    public User select(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public void update(User user) {
        userMapper.updateById(user);
    }

    @Override
    public void delete(int id) {
        userMapper.deleteById(id);
    }
}
