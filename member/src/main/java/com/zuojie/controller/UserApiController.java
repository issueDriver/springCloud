package com.zuojie.controller;

import com.zuojie.entity.UserEntity;
import com.zuojie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public UserEntity getUser(Integer userId) {
        return userService.getUser(userId);
    }
}
