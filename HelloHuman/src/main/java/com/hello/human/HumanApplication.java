package com.hello.human;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HumanApplication {

    public static void main(String[] args) {
        SpringApplication.run(HumanApplication.class, args);
    }

    @RequestMapping("/")
    public String index(@RequestParam(value = "name") String searchQuery){
        if(searchQuery == null)
            return "<h1>Hello Human!</h1> <br> <h2>Welcome to Spring Boot!</h2>";
        else
            return "<h1>Hello "+searchQuery+"</h1> <br> <h2>Welcome to Spring Boot!</h2>";
    }

}
