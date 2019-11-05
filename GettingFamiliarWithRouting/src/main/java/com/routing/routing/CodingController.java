package com.routing.routing;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {

    @RequestMapping("")
    public String index(){
        return "<h1>Hello Coding Dojo!</h1>";
    };

    @RequestMapping("/python")
    public String python(){
        return "<h1>Python/Django was awesome!</h1>";
    };

    @RequestMapping("/java")
    public String java(){
        return "<h1>Java/Spring is better!</h1>";
    };
}
