package org.theoliverlear.randomcolor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.theoliverlear.randomcolor.model.RandomHex;
@Controller
public class RandomColorController {
    @GetMapping("/")
    public String index(Model model) {
        RandomHex randomHex = new RandomHex();
        String hex = randomHex.getHex();
        model.addAttribute("bodyStyle", "background-color: " + hex + ";");
        model.addAttribute("colorCode", hex);
        return "index";
    }
}
