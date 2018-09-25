package com.wandou.tk;

import com.wandou.tk.constant.NameConst;
import org.apache.commons.collections.CollectionUtils;
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
}
