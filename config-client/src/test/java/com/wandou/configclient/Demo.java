package com.wandou.configclient;

import com.wandou.configclient.constant.NameConst;
import com.wandou.configclient.po.User;
import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author liming
 * @date 2018/9/20 17:36
 * @description
 * @modify
 */
public class Demo {

    @Test
    public void m1() {
        System.out.println(NameConst.jinSwordsmans);
        int i = CollectionUtils.maxSize(NameConst.jinSwordsmans);
        System.out.println(i);
    }

    @Test
    public void m2() {
        User user = User.builder()
                .id(1L)
                .realName("马云")
                .build();

        User user2 = User.builder()
                .id(2L)
                .realName("李想")
                .build();

        User user3 = User.builder()
                .id(3L)
                .realName("雷军")
                .build();

        User user4 = User.builder()
                .id(4L)
                .realName("天龙")
                .build();

        List<User> list = new ArrayList();
        list.add(user3);
        list.add(user4);
        list.add(user);
        list.add(user2);
        System.out.println(list);

        Map<Long, User> map = list.stream().collect(Collectors.toMap(User::getId, u -> u));
        System.out.println(map);
        System.out.println(map.getClass().getName());
        System.out.println(map.getClass());
        System.out.println(map.getClass().getCanonicalName());
        Collection<User> values = map.values();
        System.out.println(values);

        Map<Long, User> treeMap = new TreeMap();
        treeMap = list.stream().collect(Collectors.toMap(User::getId, u -> u));
        System.out.println(treeMap);
        System.out.println(treeMap.getClass());
    }
}
