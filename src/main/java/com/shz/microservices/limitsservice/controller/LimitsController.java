package com.shz.microservices.limitsservice.controller;

import com.shz.microservices.limitsservice.bean.Limits;
import com.shz.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits getLimits(){
        return new Limits(configuration.getMin(), configuration.getMax());
        //return new Limits(10,60);
    }
}
