package tr.com.kansu.yasin.spring_helloworld_example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.com.kansu.yasin.spring_helloworld_example.bean.FullAdder;
import tr.com.kansu.yasin.spring_helloworld_example.model.Student;

import java.util.Date;

@RestController
public class RestServiceController {

    @Autowired
    FullAdder adder;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return "Hello world";
    }

    @GetMapping("addNumbers")
    public String addNumbers(@RequestParam int a, @RequestParam int b) {
        int sum = a + b;
        return "Sum: " + adder.add(a, b);
    }

    @RequestMapping("/getStudent")
    public Student getStudent() {
        Student student = new Student();
        student.setName("yasin kansu");
        student.setAge(426);
        student.setBirthDate(new Date(System.currentTimeMillis()));
        return student;
    }

    @RequestMapping(value = "/createStudent", method = RequestMethod.POST)
    public Student createStudent(@RequestBody Student student) {
        return student;
    }

 /*   @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }*/
}
