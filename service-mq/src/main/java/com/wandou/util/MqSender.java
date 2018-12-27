package com.wandou.util;

import com.wandou.constant.CommonConst;
import com.wandou.constant.MqConst;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

/**
 * @author liming
 * @date 2018/11
 * @description
 * @modify
 */
@Component
public class MqSender {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String dateStr = DateFormatUtils.format(new Date(), CommonConst.DATE_PATTERN);

        String context = "lm say hello " + dateStr;
        logger.info("发送消息=========》》》》 {}", context);
        this.amqpTemplate.convertAndSend(MqConst.QUEEN_HELLO, context);

    }

    public void send2() {
        String dateStr = DateFormatUtils.format(new Date(), CommonConst.DATE_PATTERN);

        String context = "lm say hello " + DateFormatUtils.format(new Date(), CommonConst.DATE_PATTERN);
        logger.info("发送消息=========》》》》 {}", context);
//        this.amqpTemplate.convertAndSend(MqConst.QUEEN_HELLO, context);
        MessageProperties messageProperties = new MessageProperties();
        messageProperties.setMessageId(UUID.randomUUID().toString());
        messageProperties.setConsumerQueue(MqConst.QUEEN_HELLO);
        Message message = new Message(dateStr.getBytes(), messageProperties);
        this.amqpTemplate.send(message);
    }

    public void send3() {
        this.amqpTemplate.convertAndSend(MqConst.QUEEN_HELLO, this);
    }

}

