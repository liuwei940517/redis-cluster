package com.example.redis.service;

import com.example.redis.dao.UserMapper;
import com.example.redis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by lw on 2020/3/18
 *
 * @author lw
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Cacheable("5m")
    public User getUser(Integer id) {
        return userMapper.getUser(id);
    }

}
