package com.herman87.demospringsecuritybyalliBouali.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/hello")
    private ResponseEntity<String> hello() {
        return ResponseEntity.ok("hello world my app is secure");
    }
}
