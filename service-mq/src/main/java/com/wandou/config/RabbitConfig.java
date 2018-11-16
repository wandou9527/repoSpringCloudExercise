package com.wandou.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liming
 * @date 2018/9/30 18:18
 * @description
 * @modify
 */

/**
 * RabbitMQ的配置类，用来配队列、交换器、路由等高级信息
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue helloConfig() {
        return new Queue("hello");
    }
}

