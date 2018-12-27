package com.wandou;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@SpringBootApplication
public class ServiceMiyaApplication {

    private static final Logger LOG = Logger.getLogger(ServiceMiyaApplication.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    public static void main(String[] args) {
        SpringApplication.run(ServiceMiyaApplication.class, args);
    }


    @RequestMapping("/hi")
    public String home() {
        LOG.log(Level.INFO, "hi is being called");
        return "hi i'm miya!";
    }

    @RequestMapping("/miya")
    public String info() {
        LOG.log(Level.INFO, "info is being called");
        return restTemplate.getForObject("http://localhost:8988/info", String.class);
    }

    @RequestMapping("/miya/ziji")
    public String ziji() {
        LOG.info("访问 ziji 接口");
        for (int i = 0; i < 1000; i++) {
            String string = new String("str");
            System.out.println(string);
        }
        return "wo shi ziji service-miya";
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
