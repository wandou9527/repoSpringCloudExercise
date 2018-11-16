package com.wandou;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.TimeZone;

@RefreshScope
@EnableEurekaClient
@RestController
@SpringBootApplication
public class MqApplication {

    @Value("${foo}")
    String foo;
    @Value("${foo1}")
    String foo1;

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
        SpringApplication.run(MqApplication.class, args);
    }

    @RequestMapping(value = "/hi")
    public String hi() {
        return foo;
    }

    @RequestMapping(value = "/hi1")
    public String hi1() {
        String string = "str";
        String string1 = "wo 爱你商品成本";
        return foo1;
    }
}


