package com.assignment.code;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Code {

    @RequestMapping("/")
    public String index(){
        return "index.jsp";
    }

    @RequestMapping(value = "/code", method = RequestMethod.POST)
    public String code(@RequestParam(value ="code") String code, RedirectAttributes redirectAttributes, Model model){
        String[] codeArr = {"Loyalty", "Courage", "Veracity", "Compassion", "Honor"};
        for(String el : codeArr){
            if(el.equals(code)) {
                model.addAttribute("codeList", codeArr);
                return "code.jsp";
            }
        }
        redirectAttributes.addFlashAttribute("error", "You must train harder!");
        return "redirect:/";
    }
}
