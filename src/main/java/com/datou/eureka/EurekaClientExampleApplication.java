package com.datou.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientExampleApplication.class, args);
	}

}

@RestController
class RestServive{
	@GetMapping(path = "test")
	public String test(){
		return "eureka client 1";
	}
}
