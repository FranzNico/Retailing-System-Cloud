package com.example.retailingsystem.controller;

import com.example.retailingsystem.model.Sale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping
    public String showSales(Model model) {
        final List<Sale> sales = Arrays.asList(
                new Sale("1", 30.00, "..."),
                new Sale("2", 20.00, "..."),
                new Sale("3", 15.00, "...")
        );

        model.addAttribute("sales", sales);
        return "home";
    }
}
