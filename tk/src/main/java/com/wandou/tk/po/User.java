package com.wandou.tk.po;

import lombok.Data;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author liming
 * @date 2018/9/23 20:54
 * @description
 */
@ToString
@Data
public class User {

    @Id
    @GeneratedValue(generator = "JDBC") //支持自增id的返回；如不需主键返回：@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String realName;
    private String phone;
    private String wechat;
    private Integer sex;
    private Date updateTime;

    public User() {
    }
}
