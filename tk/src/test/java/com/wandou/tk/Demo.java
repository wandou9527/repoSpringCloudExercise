package com.wandou.tk;

import com.wandou.tk.constant.NameConst;
import com.wandou.tk.po.GlobalId;
import com.wandou.tk.util.IdUtil;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

/**
 * @author liming
 * @date 2018/9/
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
        for (int i = 0; i < 20; i++) {
            String random = RandomStringUtils.random(8, false, true);
            System.out.println("random " + random);
        }
        for (int i = 0; i < 20; i++) {
            String s = RandomStringUtils.randomAlphabetic(8);
            System.out.println("randomAlphabetic " + s);
        }
        for (int i = 0; i < 20; i++) {
            String s1 = RandomStringUtils.randomAlphanumeric(6);
            System.out.println("randomAlphanumeric：" + s1);

        }
        for (int i = 0; i < 20; i++) {
            String s2 = RandomStringUtils.randomAscii(6);
            System.out.println("randomAscii " + s2);

        }
        for (int i = 0; i < 20; i++) {
            String s3 = RandomStringUtils.randomNumeric(6);
            System.out.println("randomNumeric " + s3);
        }
    }

    @Test
    public void m3ToString() {
        GlobalId globalId = new GlobalId();
        globalId.setItype(7);
        System.out.println(globalId);
    }

    @Test
    public void m4GlobalId() {
        Long aLong = new IdUtil().genGlobalId(1, null);
        System.out.println(aLong);
        //报错，因为没有mapper对象
    }

    @Test
    public void m5() {
        int [] arr = {};
        boolean empty = ArrayUtils.isEmpty(arr);
        System.out.println(empty);
    }
}
