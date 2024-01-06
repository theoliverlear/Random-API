package org.theoliverlear.randomnumber;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.theoliverlear.randomnumber.generator.DecNumberGenerator;
import org.theoliverlear.randomnumber.generator.IntNumberGenerator;

@Controller // This means the class does something for the web app. It's a
            // general statement about its functionality.
public class WebGeneratorController {
    //------------------------------Variables---------------------------------
    IntNumberGenerator intNumGen;
    DecNumberGenerator decNumGen;
    String type;
    //-----------------------------Constructor--------------------------------
    public WebGeneratorController() {
        this.intNumGen = new IntNumberGenerator();
        this.decNumGen = new DecNumberGenerator();
    }
    //-----------------------------Default-Path-------------------------------
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("numFormat", "decimal");
        this.decNumGen.formulateNumber();
        model.addAttribute("number", this.decNumGen.getRandomNumber());
        return "index";
    }

    //---------------------------Random-Path----------------------------------
    @GetMapping("/random") // This means the method will be called when the
                              // user goes to the /random path.
    public String randomNumber(Model generatedNumber, @RequestParam String type) {
        if (type.equals("integer")) {
            this.intNumGen.formulateNumber();
            generatedNumber.addAttribute("number",
                    this.intNumGen.getRandomNumber());
        } else {
            this.decNumGen.formulateNumber();
            generatedNumber.addAttribute("number",
                    this.decNumGen.getRandomNumber());
        }
        this.updateHeader(generatedNumber);
        return "generatedNumberFragment :: generatedNumberFragment";
    }
    //----------------------------Formulate-Path------------------------------
    @PostMapping("/formulate")
    public String calculate(Model userPreferences, @RequestParam int min,
                                                   @RequestParam int max,
                                                   @RequestParam String type) {
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        this.intNumGen.setMin(min);
        this.intNumGen.setMax(max);
        this.decNumGen.setMin(min);
        this.decNumGen.setMax(max);
        this.intNumGen.formulateNumber();
        this.decNumGen.formulateNumber();
        if (type.equals("integer")) {
            userPreferences.addAttribute("number",
                    this.intNumGen.getRandomNumber());
        } else {
            userPreferences.addAttribute("number",
                    this.decNumGen.getRandomNumber());
        }
        this.updateHeader(userPreferences);
        return "index";
        //return "generatedNumberFragment :: generatedNumberFragment";
    }
    //-----------------------------Update-Header------------------------------
    public String updateHeader(Model mixMaxHeader) {
        mixMaxHeader.addAttribute("min", this.intNumGen.getMin());
        mixMaxHeader.addAttribute("max", this.intNumGen.getMax());
        return "index";
    }

}