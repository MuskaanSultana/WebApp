package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoubleController {
    @GetMapping("/double")
    public int doubleNumber(@RequestParam("number") int number) {
        return (number*2);
    }
}