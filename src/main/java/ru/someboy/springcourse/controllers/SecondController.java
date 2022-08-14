package ru.someboy.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Slipets Artem
 */
@Controller
@RequestMapping("/second")
public class SecondController {
    @GetMapping("/exit")
    public String exit() {
        return "second/exit";
    }
}
