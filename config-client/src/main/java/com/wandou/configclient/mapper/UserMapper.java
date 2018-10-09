package com.wandou.configclient.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wandou.configclient.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author liming
 * @date 2018/9/23 20:56
 * @description
 */
public interface UserMapper extends BaseMapper<User> {
}
