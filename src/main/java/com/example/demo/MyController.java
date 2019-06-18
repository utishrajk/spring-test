package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Cruel World!!!";
    }

    @GetMapping("/hellos")
    public List<String> hellos() {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Nice");
        list.add("World");
        list.add("and");
        list.add("universe");
        return list;
    }
}
