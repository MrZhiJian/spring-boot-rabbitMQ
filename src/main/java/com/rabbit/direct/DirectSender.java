package com.rabbit.direct;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DirectSender {

	@Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String sendMsg = "direct " + new Date();
        System.out.println("Sender : " + sendMsg);
        this.rabbitTemplate.convertAndSend("hello", sendMsg);
    }
    
    public void send(int i) {
    	String msg="sender message:";
    	System.out.println("sender:"+msg+i);
    	this.rabbitTemplate.convertAndSend("topic.message",msg+i);
    }
}
