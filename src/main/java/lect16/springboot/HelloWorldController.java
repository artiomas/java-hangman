package lect16.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping
    public String hw() {
        return "<b> HelloWorld! :) </b>";
    }

    @GetMapping
    @RequestMapping("/mano/nemano")
    public String hw2() {
        return "kdsjhflkdshfkjdshfk";
    }

}