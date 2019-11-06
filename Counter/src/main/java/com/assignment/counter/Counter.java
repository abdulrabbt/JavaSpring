package com.assignment.counter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class Counter {

    @RequestMapping("/")
    public String index(){
        return "index.jsp";
    }

    @RequestMapping("/counter")
    public String count(HttpSession session, Model model){
        if(session.getAttribute("count") == null)
            session.setAttribute("count", 0);

        Integer count = (Integer) session.getAttribute("count");
        count += 1;
        session.setAttribute("count", count);

        model.addAttribute("count", count);
        return "counter.jsp";
    }
}
