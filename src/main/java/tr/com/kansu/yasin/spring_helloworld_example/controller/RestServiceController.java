package tr.com.kansu.yasin.spring_helloworld_example.controller;

import org.springframework.web.bind.annotation.*;
import tr.com.kansu.yasin.spring_helloworld_example.model.Student;

import java.util.Date;

@RestController
public class RestServiceController {

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "Hello world";
    }

    @RequestMapping("/getStudent")
    public Student getStudent(){
        Student student = new Student();
        student.setName("yasin kansu");
        student.setNo(426);
        student.setDate(new Date(System.currentTimeMillis()));
        return student;
    }

    @RequestMapping(value="/createStudent", method= RequestMethod.POST)
    public Student createStudent( Student student){
        return student;
    }
}
