package com.prometheus.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RestfulApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulApplication.class, args);
	}
	
	
	@RestController
	public class Dux {
		
		@RequestMapping("/pussy")
		public String TweetTest(@RequestParam(value="argument", defaultValue="cock") String argument) {
			return argument.equals("pussy")?"duce":"stick in your ass";
		}
	}
	
}
