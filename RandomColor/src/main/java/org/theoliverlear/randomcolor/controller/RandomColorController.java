package org.theoliverlear.randomcolor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.theoliverlear.randomcolor.model.RandomHex;

import java.util.ArrayList;

@Controller
public class RandomColorController {
    ArrayList<String> savedColors = new ArrayList<String>();
    @GetMapping("/")
    public String index(Model model) {
        RandomHex randomHex = new RandomHex();
        String hex = randomHex.getHex();
        model.addAttribute("bodyStyle", "background-color: " + hex + ";");
        model.addAttribute("colorCode", hex);
        return "index";
    }
    @PostMapping("/save/{color}")
    public String saveColor(Model model, @PathVariable String color) {
        this.savedColors.add(color);
        model.addAttribute("savedColors", this.savedColors + " ");
        System.out.println(this.savedColors);
        return "index";
    }
}
