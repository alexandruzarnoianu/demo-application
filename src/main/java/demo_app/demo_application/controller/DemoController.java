package demo_app.demo_application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String printStuff() {
        return "I fucking did it! B-)";
    }

    @GetMapping("/hello")
    public String printMoreStuff() {
        return "This actually works";
    }
}
