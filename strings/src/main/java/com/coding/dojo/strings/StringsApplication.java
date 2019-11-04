package com.coding.dojo.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsApplication {

    public static void main(String[] args) {
        SpringApplication.run(StringsApplication.class, args);
    }

    @RequestMapping("/")
    public String index(){
        return "Hello Client! How are you doing ?";
    }

    @RequestMapping("/random")
    public String random(){
        return "Spring Boot is great.";
    }

}
