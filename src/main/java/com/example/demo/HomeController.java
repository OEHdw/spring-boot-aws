package com.example.demo;

import com.example.demo.model.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.apache.log4j.Logger;

@RestController
public class HomeController {

    final static Logger logger = Logger.getLogger(HomeController.class);

    @RequestMapping
    public Model hello(){
        logger.info("starting home controller");
        Model model = new Model();
        model.setName("hey");
        logger.info(model);
        return model;
    }

}
