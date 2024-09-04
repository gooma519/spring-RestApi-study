package com.koo.forumbe;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class IndexController {
    @GetMapping("/")
    public String index() {
        System.out.println("요청");
        return "hi";
    }
}
