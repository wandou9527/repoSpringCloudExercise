package com.wandou;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * @author liming
 * @date 2018/10/26 18:29
 * @description
 * @modify
 */
public class DesensitizationUtilTest {

    @Test
    public void m1() {
        String mobile = mobile("13904630511");
        System.out.println(mobile);
        String mobile1 = mobile("230183199103122810");
        System.out.println(mobile1);
    }

    public String mobile(String mobile) {
        if (StringUtils.isBlank(mobile)) {
            return mobile;
        }
        return mobile.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
    }

    @Test
    public void idEncrypt() {
        String id = "230183199103122810";
        System.out.println(id.replaceAll("(?<=\\w{3})\\w(?=\\w{4})", "*"));
//        return id.replaceAll("(?<=\\w{3})\\w(?=\\w{4})", "*");
    }
//---------------------
//    作者：jieniyimiao
//    来源：CSDN
//    原文：https://blog.csdn.net/u013467442/article/details/82023375
//    版权声明：本文为博主原创文章，转载请附上博文链接！


    @Test
    public void email() {
        String email = "limingcm@163.com";
        int index = StringUtils.indexOf(email, "@");
        String str = StringUtils.rightPad(StringUtils.left(email, 4), index, "*");
        System.out.println(str);
        String str2 = str.concat(StringUtils.mid(email, index, email.length()));
        System.out.println(str2);

    }


}
