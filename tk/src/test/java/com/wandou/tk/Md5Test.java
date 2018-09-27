package com.wandou.tk;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.Md5Crypt;
import org.apache.tomcat.util.security.MD5Encoder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * @author liming
 * @date 2018/9/27 17:59
 * @description
 * @modify
 */
public class Md5Test {

    @Test
    public void m1() throws UnsupportedEncodingException {
        byte[] bytes = new String("li").getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

//        String li = MD5Encoder.encode(new String("li").getBytes());
//        System.out.println(li);
//
//        String li1 = MD5Encoder.encode(new String("li1").getBytes());
//        System.out.println(li1);
//
//        String md5Crypt = Md5Crypt.md5Crypt(new String("li").getBytes(), "s878734", "md555");
//        System.out.println(md5Crypt);

        byte[] md5 = DigestUtils.md5("li");
        System.out.println(md5);
        String string = new String(md5);
        System.out.println(string);

        String md5Hex = DigestUtils.md5Hex("li2");
        System.out.println(md5Hex);
        String md5Hex1 = DigestUtils.md5Hex("li2");
        System.out.println(md5Hex1);
        String md5Hex3 = DigestUtils.md5Hex("li3");
        System.out.println(md5Hex3);
    }
}
