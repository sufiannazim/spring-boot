package com.jenkins.integration.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

    @GetMapping("/addTwoNumbers")
    public Integer addTwoNumbers(@RequestParam Integer firstNumber, @RequestParam Integer secondNumber) {
        return firstNumber + secondNumber;
    }
}
