package com.cffy.gradle01;

import com.cffy.gradle01.entity.User;
import com.cffy.gradle01.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectList(){
        System.out.println("测试 2");
        List<User> list = userMapper.selectList(null);
        list.forEach(System.out::println);
    }
}
