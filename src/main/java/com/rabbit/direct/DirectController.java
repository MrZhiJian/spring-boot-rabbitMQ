package com.rabbit.direct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/direct")
public class DirectController {
	
	@Autowired
    private DirectSender helloSender1;
    @Autowired
    private DirectSender helloSender2;
    
    @RequestMapping("/hello")
    public void hello() {
        helloSender1.send();
    }
    
    @RequestMapping("/oneToMany")
    public void oneToMany() {
    	for(int i=0;i<10;i++) {
    		helloSender2.send(i);
    	}
    }

}
