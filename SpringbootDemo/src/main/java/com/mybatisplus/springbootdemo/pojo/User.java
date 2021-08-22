package com.mybatisplus.springbootdemo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Emm
 * @Date 2021/8/22 15:58
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    /**
     * auto自增——数据库id必须自增
     * uuid——生成uuid（string类型）
     * id_work——生成唯一id（Long类型）
     * input——手动创建id(如果是自增可以不输入，如果不是自增必须输入不然会报错)
     */
    @TableId(type = IdType.INPUT)
    private Long id;
    private String name;
    private int age;
    private String email;
}
