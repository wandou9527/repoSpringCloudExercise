package com.wandou.tk;

import com.wandou.tk.mapper.UserMapper;
import com.wandou.tk.po.User;
import com.wandou.tk.po.UserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Table;
import java.util.List;

/**
 * @author liming
 * @date 2018/9/29 17:03
 * @description
 * @modify
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleTest {

    @Autowired
    private UserMapper userMapper;

    /**
     * mbg 生成 example
     */
    @Test
    public void m1() {
//        UserExample userExample = new UserExample();
//        userExample.createCriteria().andRealNameEqualTo("乔峰");
//        List<User> users = userMapper.selectByExample(userExample);
//        System.out.println(users.size());
//        System.out.println(users);

        UserExample userExample1 = new UserExample();
        userExample1.createCriteria().andIdBetween(5L, 10L);
        List<User> users1 = userMapper.selectByExample(userExample1);
        System.out.println(users1.size());
        System.out.println(users1);
    }

    /**
     * 通用 Example (通用 Mapper 的)
     */
    @Test
    public void m2() {
        Example example = new Example(User.class);
        example.createCriteria().andGreaterThan("id", 5L).andLessThan("id", 11L);
        example.or().andLessThan("id", 2L);
        example.or().andEqualTo("realName", "摘星子").andEqualTo("username", "1120");
        //todo 可以理解为 example.createCriteria() 就是在sql中加个括号（）
        List<User> users = userMapper.selectByExample(example);
        System.out.println(users.size());
        System.out.println(users);
    }

    /**
     * 通用 example 排序
     */
    @Test
    public void m3OrderBy() {
        Example example = new Example(User.class);
        example.orderBy("realName").orderBy("phone").desc().orderBy("id").asc();

        List<User> users = userMapper.selectByExample(example);
        System.out.println(users.size());
        System.out.println(users);

        example.builder(User.class)
                .setDistinct(true)
                .build();
    }

    @Test
    public void m4Update() {
        User userRecord = new User();
        userRecord.setPhone("13388");

        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("realName", "李明");

        int i = userMapper.updateByExampleSelective(userRecord, example);

        System.out.println(i);
    }

}
