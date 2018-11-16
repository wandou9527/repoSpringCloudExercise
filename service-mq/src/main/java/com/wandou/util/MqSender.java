package com.wandou.util;

import com.wandou.constant.CommonConst;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
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
public class MqSender {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sende() {
        String context = "lm say hello " + DateFormatUtils.format(new Date(), CommonConst.DATE_PATTERN);
        logger.info("发送消息=========》》》》{}", context);
        this.amqpTemplate.convertAndSend("hello", context);
    }
}

