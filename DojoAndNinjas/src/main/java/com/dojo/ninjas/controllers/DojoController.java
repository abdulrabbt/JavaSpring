package com.dojo.ninjas.controllers;

import com.dojo.ninjas.models.Dojo;
import com.dojo.ninjas.services.DojoNinjaServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class DojoController {
    private final DojoNinjaServices dojoNinjaServices;

    public DojoController(DojoNinjaServices dojoNinjaServices) {
        this.dojoNinjaServices = dojoNinjaServices;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("dojos", dojoNinjaServices.getAllDojo());
        return "index.jsp";
    }

    @GetMapping("/dojos/new")
    public String newDojo(@ModelAttribute("dojoObject") Dojo dojo) {
        return "newDojo.jsp";
    }

    @PostMapping("/dojos/create")
    public String addDojo(@Valid @ModelAttribute("dojoObject") Dojo dojo, BindingResult result) {
        if(result.hasErrors()) {
            return "newDojo.jsp";
        }
        else {
            dojoNinjaServices.createDojo(dojo);
            return "redirect:/ninjas/new";
        }
    }

    @GetMapping("/dojos/{dojoId}")
    public String showDojo(@PathVariable("dojoId") long id, Model model) {
        Dojo dojo = dojoNinjaServices.getOne(id);
        model.addAttribute("dojo", dojo);
        return "show.jsp";
    }
}
