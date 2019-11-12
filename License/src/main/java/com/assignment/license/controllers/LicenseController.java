package com.assignment.license.controllers;

import com.assignment.license.models.License;
import com.assignment.license.models.Person;
import com.assignment.license.services.LicenseService;
import com.assignment.license.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class LicenseController {
    private final LicenseService licenseService;

    public LicenseController(LicenseService licenseService) {
        this.licenseService = licenseService;
    }

    @Autowired
    private PersonService personService;

    @RequestMapping("/licenses/new")
    public String newLicenses(@ModelAttribute("licenseObject") License license, Model model){
        List<Person> personsList = personService.allPerson();
        model.addAttribute("personsList", personsList);

        ArrayList<String> states = new ArrayList<String>(Arrays.asList("Riyadh", "Jeddeh", "Dubi", "Dammam"));
        model.addAttribute("states", states);
        return "newLicense.jsp";
    }

    @RequestMapping(value="/addlicense", method= RequestMethod.POST)
    public String createLicense(@Valid @ModelAttribute("licenseObject") License license, BindingResult result) {
        if (result.hasErrors()) {
            return "newLicense.jsp";
        }
        else {
            String number = licenseService.generateLicenseNumber();
            license.setNumber(number);
            licenseService.createLicense(license);
            return "redirect:/persons/" +license.getId();
        }
    }
}
