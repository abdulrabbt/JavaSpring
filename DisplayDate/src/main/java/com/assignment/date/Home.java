package com.assignment.date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class Home {
    @RequestMapping("/")
    public String index(){
        return "index.jsp";
    }

    @RequestMapping("/date")
    public String date(Model model){
        String datePattern = "EEEEE, dd MMMMM, yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
//        System.out.println(dateFormat);
        String date = dateFormat.format(new Date());
//        System.out.println(date);
        model.addAttribute("date", date);
        return "date.jsp";
    }

    @RequestMapping("/time")
    public String time(Model model){
        String timePattern = "hh:mm a";
        SimpleDateFormat timeFormat = new SimpleDateFormat(timePattern);
        String time = timeFormat.format(new Date());
        model.addAttribute("time", time);
        return "time.jsp";
    }
}
