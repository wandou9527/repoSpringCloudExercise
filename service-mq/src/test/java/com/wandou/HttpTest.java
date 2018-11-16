package com.wandou;

import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @author liming
 * @date 2018/9/30 16:37
 * @description
 * @modify
 */
public class HttpTest {

    @Test
    public void m1() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> stringResponseEntity = restTemplate.postForEntity("http://localhost:8881/bus/refresh", null, String.class);
        System.out.println(stringResponseEntity.getBody().toString());
    }
}
