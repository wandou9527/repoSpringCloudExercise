package com.wandou.configclient;

import com.wandou.configclient.constant.NameConst;
import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;

import java.util.Collections;

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
}
