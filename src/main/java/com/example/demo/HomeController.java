package com.example.demo;

import com.example.demo.model.Model;
import org.apache.log4j.BasicConfigurator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

@RestController
public class HomeController {

    final static Logger logger = Logger.getLogger(HomeController.class.getName());

    @RequestMapping
    public Model hello() throws IOException {
        BasicConfigurator.configure();
        Handler handler = new FileHandler("emilio.log");
        logger.addHandler(handler);
        logger.info("starting home controller");
        Model model = new Model();
        model.setName("hey");
        logger.info(model.getName());
        return model;
    }

}
