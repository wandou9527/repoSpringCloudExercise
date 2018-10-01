package com.wandou.configclient.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author liming
 * @date 2018/9/30 18:12
 * @description
 * @modify
 */
@Component
public class MqReceiver {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AmqpTemplate amqpTemplate;

    @RabbitHandler
    public void receiver(String hello) {
        logger.info("接收消息=====》》》》》{}", hello);
    }
}

