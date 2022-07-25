package com.demoaws.demoaws.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class userController {
@GetMapping("hello")
    public String hello(){return "hola profesor christian, un saludo";}
    
}
