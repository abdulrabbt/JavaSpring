package com.dojo.ninjas.controllers;

import com.dojo.ninjas.models.Ninja;
import com.dojo.ninjas.services.DojoNinjaServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class NinjaController {
    private final DojoNinjaServices dojoNinjaServices;

    public NinjaController(DojoNinjaServices dojoNinjaServices) {
        this.dojoNinjaServices = dojoNinjaServices;
    }

    @GetMapping("/ninjas/new")
    public String newNinja(@ModelAttribute("ninjaObject") Ninja Ninja, Model model) {
        model.addAttribute("dojos", dojoNinjaServices.getAllDojo());
        return "newNinja.jsp";
    }

    @PostMapping("/ninjas/create")
    public String addNinja(@Valid @ModelAttribute("ninjaObject") Ninja ninja, BindingResult result) {
        if(result.hasErrors()) {
            return "newNinja.jsp";
        }
        else {
            dojoNinjaServices.createNinja(ninja);
            return "redirect:/dojos/" + ninja.getDojo().getId() ;
        }
    }
}
