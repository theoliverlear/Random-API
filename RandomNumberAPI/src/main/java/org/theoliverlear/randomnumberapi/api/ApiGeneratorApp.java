package org.theoliverlear.randomnumberapi.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGeneratorApp {
    public static void main(String[] args) {
        SpringApplication.run(ApiGeneratorApp.class, args);
        // TODO: in Color branch, have the color generator
        //       generate a random number between 1 and 16
        //       and then use that number to select a hexidecimal
        //       and repeat 6 times to generate a hexidecimal color
    }
}
