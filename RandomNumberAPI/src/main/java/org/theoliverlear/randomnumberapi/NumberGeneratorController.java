package org.theoliverlear.randomnumberapi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // This means the class does something for the web app. It's a
            // general statement about its functionality.
public class NumberGeneratorController {
    //------------------------------Variables---------------------------------
    NumberGenerator numGen;
    //-----------------------------Constructor--------------------------------
    public NumberGeneratorController() {
        this.numGen = new NumberGenerator();
    }
    //-----------------------------Default-Path-------------------------------
    @GetMapping("/")
    public String home() {
        return "index"; // This refers to the Thymeleaf template that will be
        // used to display the data.
    }
    //---------------------------Random-Path----------------------------------
    @GetMapping("/random") // This means the method will be called when the
    // user goes to the /random path.
    public String randomNumber(Model generatedNumber) {
        this.numGen.formulateNumber();
        generatedNumber.addAttribute("number",
                                     this.numGen.getRandomNumber());
        this.updateHeader(generatedNumber);
        return "index"; // This refers to the Thymeleaf template that will be
        // used to display the data.
    }
    //----------------------------Formulate-Path------------------------------
    @PostMapping("/formulate")
    public String calculate(Model userPreferences, @RequestParam int min,
                                                   @RequestParam int max) {
        this.numGen.setMin(min);
        this.numGen.setMax(max);
        this.numGen.formulateNumber();
        userPreferences.addAttribute("number",
                                     this.numGen.getRandomNumber());
        this.updateHeader(userPreferences);
        return "index";
    }
    //-----------------------------Update-Header------------------------------
    public String updateHeader(Model mixMaxHeader) {
        mixMaxHeader.addAttribute("min", this.numGen.getMin());
        mixMaxHeader.addAttribute("max", this.numGen.getMax());
        return "index";
    }
}