package com.example.redis.entity;

import java.io.Serializable;
import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author 
 * 
 */
@Data
@Alias("User")
public class User implements Serializable {
    private Long id;

    private String name;

    private String sex;

    private Integer age;

    private static final long serialVersionUID = 1L;
}