package com.rabbit.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topic")
public class TopicController {
	
	@Autowired
	private TopicSender sender;

	@RequestMapping("/topic")
	public String testTopic() {
		sender.send();
		return "success";
	}
}
