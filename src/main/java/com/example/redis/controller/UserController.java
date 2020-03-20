package com.example.redis.controller;

import com.example.redis.entity.User;
import com.example.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lw on 2020/3/18
 *
 * @author lw
 */
@RestController
public class UserController {


    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public User geUser(@PathVariable("id") Integer id) {
        return userService.getUser(id);
    }

}
