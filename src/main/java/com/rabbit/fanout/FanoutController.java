package com.rabbit.fanout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fanout")
public class FanoutController {
	
	@Autowired
	private FanoutSender sender;
	
	@RequestMapping("/fanout")
	public String send() {
		sender.send();
		return "success";
	}

}
