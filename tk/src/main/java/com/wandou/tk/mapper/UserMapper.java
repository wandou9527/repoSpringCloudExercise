package com.wandou.tk.mapper;

import com.wandou.tk.po.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author liming
 * @date 2018/9/
 * @description
 */
@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {
}
