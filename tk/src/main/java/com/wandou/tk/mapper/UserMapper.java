package com.wandou.tk.mapper;

import com.wandou.tk.po.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author liming
 * @date 2018/9/
 * @description
 */
//@org.apache.ibatis.annotations.Mapper //启动类加@MapperScan("com.wandou.tk.mapper")和Mapper加注解此项选其一
public interface UserMapper extends Mapper<User> {
}
