package com.wandou.serverzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

import java.util.TimeZone;

@EnableZipkinServer
@SpringBootApplication
public class ServerZipkinApplication {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
        SpringApplication.run(ServerZipkinApplication.class, args);
    }
}
