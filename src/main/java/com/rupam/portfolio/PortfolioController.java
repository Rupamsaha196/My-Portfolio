package com.rupam.portfolio;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
public class PortfolioController {
@GetMapping("/")
    public String home() {
        // This looks for index.html in static or templates
        return "index.html"; 
    }
}
