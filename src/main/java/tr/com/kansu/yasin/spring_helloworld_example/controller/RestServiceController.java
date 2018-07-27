package tr.com.kansu.yasin.spring_helloworld_example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServiceController {

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "Hello world";
    }
}
