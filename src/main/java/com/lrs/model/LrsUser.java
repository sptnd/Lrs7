package com.lrs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/27 20:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LrsUser implements Serializable {
    /*
    创建数据库的表对应的实体类对象
     */
    private Integer id;
    private String name;
    private String password;
}
