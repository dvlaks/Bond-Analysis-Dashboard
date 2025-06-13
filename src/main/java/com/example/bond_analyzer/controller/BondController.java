package com.example.bond_analyzer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.bond_analyzer.domain.Bond;
import com.example.bond_analyzer.service.BondService;

@Controller
public class BondController {

    private final BondService bondService;

    @Autowired
    public BondController(BondService bondService) {
        this.bondService = bondService;
    }

    @GetMapping("/dashboard")
    public String getDashboard(Model model) {
        // 1. Get all bonds from the service (it will find our Apple bond)
        List<Bond> allBonds = bondService.findAllBonds();

        // 2. Add the list of bonds to a "model" object.
        //    This makes the data available to the HTML page.
        model.addAttribute("bonds", allBonds);

        // 3. Return the name of the HTML file to show the user.
        //    We will create this file in the next step.
        return "dashboard";
    }
}