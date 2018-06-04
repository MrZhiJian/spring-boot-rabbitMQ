package com.rabbit.direct;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.message")
public class DirectReceiver2 {

	@RabbitHandler
    public void process(String hello) {
        System.out.println("DirectReceiver2  : " + hello);
    }
}
