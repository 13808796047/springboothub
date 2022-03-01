package com.example.springboothub.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboothub.Entity.UserEntity;

import java.util.List;

/**
 * 用户管理业务层接口
 */
public interface UserService extends IService<UserEntity> {

    /**
     * 不分页查询所有用户信息
     */
    List<UserEntity> getUsers();

    /**
     * 根据性别查询所有用户
     *
     * @param sex 性别
     */
    List<UserEntity> getUsersBySex(String sex);

    List<UserEntity> getUsersByIdAndDate(Integer userId, Integer age);

    boolean updateByUserId(String userId);
}

