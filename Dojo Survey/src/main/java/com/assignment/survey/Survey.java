package com.assignment.survey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Survey {
    @RequestMapping("/")
    public String index(){
        return "index.jsp";
    }

    @RequestMapping(value = "/survey", method = RequestMethod.POST)
    public String survey(@RequestParam String name,
                         @RequestParam String location,
                         @RequestParam String language,
                         @RequestParam String comment,
                         Model model){
        String [] arr = {name, location, language, comment};
        model.addAttribute("surveyList", arr);
        return "survey.jsp";
    }
}
