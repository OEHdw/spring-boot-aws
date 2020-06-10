package com.example.demo;

import com.example.demo.model.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping
    public Model hello(){
        Model model = new Model();
        model.setName("hey");
        return model;
    }

}
