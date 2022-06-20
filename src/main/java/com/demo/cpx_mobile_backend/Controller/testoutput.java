package com.demo.cpx_mobile_backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testoutput {
    
    @GetMapping("/test_output")
    public String demo() {
        return "Hello Backend Team";
    }
}
