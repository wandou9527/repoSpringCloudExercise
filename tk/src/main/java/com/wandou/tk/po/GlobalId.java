package com.wandou.tk.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.util.Date;

/**
 * @author liming
 * @date 2018/9/27 10:52
 * @description
 * @modify
 */
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GlobalId {

    @Id
    @GeneratedValue(generator = "JDBC") //支持自增id的返回
    private Long id;
    private Integer itype;
    private Date createTime;
    private Date updateTime;
    private String requestIp;

}
