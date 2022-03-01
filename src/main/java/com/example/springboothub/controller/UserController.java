package com.example.springboothub.controller;

import com.example.springboothub.Entity.UserEntity;
import com.example.springboothub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 不分页查询所有用户信息
     */
    @GetMapping
    public List<UserEntity> getUserList() {
        return userService.getUsers();
    }

    /**
     * 根据性别查询所有用户
     *
     * @param sex 性别
     */
    @GetMapping("/get-by-name")
    public List<UserEntity> getUsersBySex(@RequestParam(name = "sex") String sex) {
        return userService.getUsersBySex(sex);
    }
}
