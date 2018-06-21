package me.aboullaite.jib.gitlabregistry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class SimpleController {

    @GetMapping
    public String helloWorld(){
        return "Hello World!";
    }
}
