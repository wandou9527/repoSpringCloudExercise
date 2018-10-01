package com.wandou.configclient;

import com.wandou.configclient.mapper.UserMapper;
import com.wandou.configclient.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigClientApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testMPGet() {
        User user = userMapper.selectById(16);
        System.out.println(user.getRealName());
    }

    @Test
    public void testSelectList() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

}
