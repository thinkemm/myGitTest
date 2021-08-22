package com.mybatisplus.springbootdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatisplus.springbootdemo.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @Author Emm
 * @Date 2021/8/22 15:59
 * @Version 1.0
 */

/**
 * 直接使用@Mapper就不用在启动类上加上@MapperScan注解
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
