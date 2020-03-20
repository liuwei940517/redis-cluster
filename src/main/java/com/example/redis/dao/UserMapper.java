package com.example.redis.dao;



import com.example.redis.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User getUser(@Param("id") Integer id);
}