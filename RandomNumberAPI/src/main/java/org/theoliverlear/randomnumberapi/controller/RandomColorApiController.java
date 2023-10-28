package org.theoliverlear.randomnumberapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.theoliverlear.randomnumberapi.model.RandomHex;
import org.theoliverlear.randomnumberapi.service.ColorService;
@Controller
public class RandomColorApiController {
    @GetMapping("/")
    public String index(Model model) {
        RandomHex randomHex = new RandomHex();
        String hex = randomHex.getHex();
        model.addAttribute("bodyStyle", "background-color: " + hex + ";");
        model.addAttribute("message", hex);
        return "index";
    }
}
