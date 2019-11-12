package com.assignment.license.controllers;

import com.assignment.license.models.Person;
import com.assignment.license.services.LicenseService;
import com.assignment.license.services.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
public class PersonController {
    private final PersonService personService;
    private final LicenseService licenseService;

    public PersonController(PersonService personService, LicenseService licenseService) {
        this.personService = personService;
        this.licenseService = licenseService;
    }

    @RequestMapping("/persons/new")
    public String newPerson(@ModelAttribute("personObject") Person person, Model model) {
        return "newPerson.jsp";
    }

    @RequestMapping(value="/addperson", method= RequestMethod.POST)
    public String createPerson(@Valid @ModelAttribute("personObject") Person person, BindingResult result) {
        if (result.hasErrors()) {
            return "newPerson.jsp";
        }
        else {
            personService.CreatePerson(person);
            return "redirect:licenses/new";
        }
    }

    @RequestMapping("/persons/{id}")
    public String viewDetails(@PathVariable("id") Long id, Model model) {
        model.addAttribute("license", licenseService.getLicense(id).get());
        return "view.jsp";
    }
}
