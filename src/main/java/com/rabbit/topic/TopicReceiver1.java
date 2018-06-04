package com.rabbit.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.message")//指定读取消息的队列名
public class TopicReceiver1 {

	@RabbitHandler
    public void process(String message) {
        System.out.println("TopicReceiver1  : " + message);
    }
}
