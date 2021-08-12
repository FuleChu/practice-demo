package com.chu.practicedemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chu.practicedemo.module.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
