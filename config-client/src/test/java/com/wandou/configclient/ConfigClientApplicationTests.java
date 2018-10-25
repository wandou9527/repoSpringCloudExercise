package com.wandou.configclient;

import com.wandou.configclient.config.ConfigPropertiesDemo;
import com.wandou.configclient.mapper.UserMapper;
import com.wandou.configclient.po.User;
import com.wandou.configclient.util.MqSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigClientApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private MqSender mqSender;
//    @Autowired
//    private ConfigPropertiesDemo configPropertiesDemo;

    @Test
    public void contextLoads() {
    }

    /**
     * mybatis-plus get
     */
    @Test
    public void testMPGet() {
        User user = userMapper.selectById(16);
        System.out.println(user.getRealName());
    }

    @Test
    public void testSelectList() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);

        List<User> users1 = userMapper.selectBatchIds(Arrays.asList(1, 2, 3, 4, 44,5, 8));
        System.out.println(users1);
    }

    @Test
    public void testMq() {
        mqSender.sende();
    }

//    @Test
//    public void m1() {
//        Map<Integer, Integer> freeQuota = configPropertiesDemo.freeQuota;
//        System.out.println(freeQuota);
//    }

}
