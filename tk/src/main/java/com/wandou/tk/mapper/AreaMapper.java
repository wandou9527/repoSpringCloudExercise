package com.wandou.tk.mapper;

import com.wandou.tk.po.Area;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author liming
 * @date 2018/9/28 17:08
 * @description
 * @modify
 */
@Mapper
public interface AreaMapper {

    @Select("select * from area")
    List<Area> list();
}
