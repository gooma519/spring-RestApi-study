package com.koo.forumbe;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
    @GetMapping("/review/{id}")
    public String review(@PathVariable Integer id) {
        System.out.println("요청 받음2");
        return Integer.toString(id);
    }
    
    @GetMapping("/list")
    public String list() {
        System.out.println("list");
        return "목록";
    }
}
