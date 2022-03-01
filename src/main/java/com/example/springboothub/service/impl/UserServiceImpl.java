package com.example.springboothub.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboothub.Entity.UserEntity;
import com.example.springboothub.dao.UserMapper;
import com.example.springboothub.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户管理业务层
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

    /**
     * 不分页查询所有用户信息
     */
    @Override
    public List<UserEntity> getUsers() {
        //直接可使用IService 封装好的一些方法，这个自行点进去看。
        return this.list();
    }

    /**
     * 根据性别查询所有用户
     *
     * @param sex 性别
     */
    @Override
    public List<UserEntity> getUsersBySex(String sex) {
        //条件构造器
        QueryWrapper<UserEntity> wrapper = new QueryWrapper<>();
        //eq 代表“ = ”；例如 eq("sex", "男") ---> sex = '男';等同于拼接在sql语句后边的where条件。
        wrapper.eq("sex", sex);
        //将条件带入返回
        List<UserEntity> list = this.list(wrapper);
        //返回数据
        return list;
    }

    @Override
    public List<UserEntity> getUsersByIdAndDate(Integer userId, Integer age) {
        //lambda条件构造器
        LambdaQueryWrapper queryWrapper = new LambdaQueryWrapper<>();
        //传入条件
        queryWrapper.eq(UserEntity::getId, userId);
        queryWrapper.eq(UserEntity::getAge, age);
        //调用修改方法
        return this.list(queryWrapper);
    }

    /**
     * 根据用户id修改用户信息
     *
     * @param userId 用户id
     */
    public boolean updateByUserId(String userId) {
        //条件构造器
        UpdateWrapper wrapper = new UpdateWrapper<>();
        //传入条件
        wrapper.eq("id", userId);
        //调用修改方法
        return this.update(wrapper);
    }


}

