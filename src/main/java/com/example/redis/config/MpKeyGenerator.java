package com.example.redis.config;

import org.springframework.cache.interceptor.KeyGenerator;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 生成有方法名（Method）和参数（params）组成的cache key
 * spring boot 默认的SimpleKeyGenerator产生的key只带参数（params）不带方法名
 */

public class MpKeyGenerator implements KeyGenerator {

    @Override
    public Object generate(Object o, Method method, Object... objects) {
        List<String> parts = new ArrayList<>(objects.length + 2);
        parts.add(method.getName());
        Stream.of(objects).forEach(p -> parts.add(p == null ? "" : p.toString()));
        return String.join("/", parts);
    }
}
