package com.routing.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

    @RequestMapping("{text}")
    public String text(@PathVariable("text") String text){
        if(text.equals("dojo"))
            return "<h1>The dojo is awesome!</h1>";
        else if(text.equals("burbank-dojo"))
            return "<h1>Burbank Dojo is located in Southern California</h1>";
        else if(text.equals("san-jose"))
            return "<h1>SJ dojo is the headquarters</h1>";
        else
            return "<h1>Error</h1>";
    }

}
