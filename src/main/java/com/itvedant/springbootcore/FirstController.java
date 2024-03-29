package com.itvedant.springbootcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itvedant.student.Student;


@Controller
public class FirstController {
    //So when client sends the request to the URL /
    //web server will call the method home mapped with this URL

    //String will be the name of the view file(html file)
    //that should be returned as the response   
    
    //Dependency Injection
    //reference variable s will get the reference/address
    //of the object created inside the container of 
    //type Student

    //Field based dependency
    @Autowired
    Student s;

    @Autowired
    Employee e;

    @RequestMapping("/")
    public String home(){
        System.out.println("Home Method Called");
        System.out.println("Dependency Injection");
        s.print();
        e.getSalary();
        return "homepage.html";
    }

    @RequestMapping("/about")
    public String about(){
        System.out.println("about method called");
        return "aboutus.html";
    }

    public String contactUs(){
        return null;
    }
}
