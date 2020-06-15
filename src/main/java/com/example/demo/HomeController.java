package com.example.demo;

import com.example.demo.model.Model;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class HomeController {

    final static Logger logger = Logger.getLogger(HomeController.class.getName());

    @RequestMapping
    public Model hello() throws IOException {
        BasicConfigurator.configure();
        logger.info("starting home controller");
        Model model = new Model();
        model.setName("hey");
        logger.info(model);
        return model;
    }

}
