package com.mybatisplus.springbootdemo;

import com.mybatisplus.springbootdemo.mapper.UserMapper;
import com.mybatisplus.springbootdemo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootDemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setName("lisi");
        user.setAge(11);
        user.setEmail("sili@qq.com");
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }

}
