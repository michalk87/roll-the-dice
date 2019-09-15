package com.example.roll.the.dice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class DrawController {

    @GetMapping("/")
    public String getNumbers(Model model) {

        Random random = new Random();
        int[] tab = {1, 2, 3, 4, 5, 6};

        int a = random.nextInt(tab.length) + 1;

        model.addAttribute("key", a);

        return "draw";
    }
}
