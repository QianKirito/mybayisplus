package com.atguigu.mybatisplus.pojo;

import com.atguigu.mybatisplus.Enum.SexEnum;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import org.springframework.stereotype.Repository;

@Data
@TableName("User")
public class User {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;

    private Integer age;

    private String email;

    private SexEnum sex;
}
