package com.springbootexample.demo.controller;

import com.springbootexample.demo.service.HelloService;
import com.springbootexample.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;
    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }

    @PostMapping("/hello")
    public String postRequest(@RequestParam("text1")String str, Model model) {
        model.addAttribute("name", str);

        return "hello/response";
    }
    @PostMapping("/hello/db")
    public String postDbRequest(@RequestParam("employeeId")int employeeId, Model model) {
        Optional<Employee> optionalemployee = this.helloService.findById(employeeId);
        Employee employee=null;
        if(!optionalemployee.isEmpty()) {
            employee = optionalemployee.get();
        }
        model.addAttribute("employee", employee);

        return "hello/db";
    }

}
