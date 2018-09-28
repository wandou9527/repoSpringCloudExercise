package com.wandou.tk.po;

import lombok.Data;

import java.util.Date;


/**
 * @author liming
 * @date 2018/9/28 17:07
 * @description
 * @modify
 */
@Data
public class Area {

    private Long id;
    private Long pid;
    private String aname;
    private Date createTime;
}
