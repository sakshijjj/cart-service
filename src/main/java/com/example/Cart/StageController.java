package com.example.stage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StageController {
    @GetMapping("/cart")
    public String getStageEnvironment() {
        return "This is a Cart Service";
    }
}

