package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

@Controller
public class DemoController {
    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    /**
     * Welcome string.
     *
     * @param model the model
     *
     * @return the string
     */
    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        //model.put("time", new Date());
        //model.put("message", this.message);
        return "welcome";
    }


    @RequestMapping("/home")
    public String home(){
        System.out.println("进入home方法");

        return "templates/home";
    }

}
