package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 和数据库里表的名字一一对应
 * 有lombok后，就可以不用写get和set方法，通过@Data注解，lombok会自动帮你去生成get和set方法
 */
@TableName("user")
@Data
public class User {
    /**
     * @TableId(type = IdType.AUTO)
     * 定义id自增
     */
    @TableId(type = IdType.AUTO)
    private Integer id;


    private String username;
    private String password;
    private String nickName;
    private Integer age;
    private String sex;
    private String address;
}
