package com.wandou.tk;

import com.wandou.tk.mapper.UserMapper;
import com.wandou.tk.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TkTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testGet() {
        User user = userMapper.selectByPrimaryKey(2);
        System.out.println(user.getRealName());
    }

    @Test
    public void testSelectList() {
//        List<User> users = userMapper.selectList(null);
//        System.out.println(users);
    }

}
