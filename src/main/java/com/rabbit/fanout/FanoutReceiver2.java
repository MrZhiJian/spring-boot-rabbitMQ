package com.rabbit.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues="fanout.B")
public class FanoutReceiver2 {

	
	@RabbitHandler
    public void process(String message) {
        System.out.println("FanoutReceiver2 from fanout.B : " + message);
    }
}
