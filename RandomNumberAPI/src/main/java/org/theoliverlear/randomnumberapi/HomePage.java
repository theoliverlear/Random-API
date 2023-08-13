package org.theoliverlear.randomnumberapi;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.stream.Stream;

@RestController
public class HomePage {
//    @GetMapping("/")
//    public String home() {
//        StringBuilder html = new StringBuilder();
//        String path = "C:\\Users\\olive\\GitHub\\RandomNumberAPI\\src" +
//                      "\\main\\resources\\templates\\index.html";
//        try (Scanner htmlReader = new Scanner(new File(path))) {
//            while (htmlReader.hasNextLine()) {
//                html.append(htmlReader.nextLine());
//            }
//        } catch (FileNotFoundException ex) {
//            System.err.println(ex.getMessage());
//        }
//        return html.toString();
//    }
}
