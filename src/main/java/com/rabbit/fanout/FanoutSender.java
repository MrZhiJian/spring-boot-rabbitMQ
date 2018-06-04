package com.rabbit.fanout;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FanoutSender {

	@Autowired
	private AmqpTemplate template;
	
	public void send() {
		String msg="I am Fanout sender。。";
		System.out.println("fanout sender:"+msg);
		template.convertAndSend("fanoutExchange", ""/*有无路由键不影响 以广播方式发送到绑定到此交换器上的所有队列*/, msg);
	}
	
}
