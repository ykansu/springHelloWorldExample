package tr.com.kansu.yasin.spring_helloworld_example.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tr.com.kansu.yasin.spring_helloworld_example.model.Student;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class RestServiceController {

    @RequestMapping("/sayHello")
    public String sayHello() {
        return "Hello world";
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
    public Student createStudent(Student student) {
        return student;
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
}
