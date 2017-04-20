package com.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ConfigClientApp {
	
	@Value("${message}")
	String message;
	
	  @RequestMapping("/messages")
	  public String home() {
	    return "Hello " + message	;
	  }
	  
	public static void main(String[] args){
		SpringApplication.run(ConfigClientApp.class, args);
	}
}
