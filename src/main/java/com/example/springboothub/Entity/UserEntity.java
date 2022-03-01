package com.example.springboothub.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class UserEntity {
    @TableId(value = "id", type = IdType.AUTO) //表示该id为自增，新增时候不需要手动设置id。
    private Integer id;

    private String name;

    private Integer age;

    private String sex;

    private String address;
}
