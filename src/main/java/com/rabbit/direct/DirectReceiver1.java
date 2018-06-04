package com.rabbit.direct;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")//队列名保持与发送者一致
public class DirectReceiver1 {

	@RabbitHandler
    public void process(String hello) {
        System.out.println("DirectReceiver1  : " + hello);
    }
	
}
