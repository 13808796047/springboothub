package com.example.springboothub.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboothub.Entity.UserEntity;
import org.springframework.stereotype.Component;

/**
 * 用户管理持久层
 */
@Component
public interface UserMapper extends BaseMapper<UserEntity> {
}