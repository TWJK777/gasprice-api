package com.example.gaspriceapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GasPriceController {

    @Autowired
    private RestService service;


    @GetMapping("/gasprice")
    public String getGasPrice() {
        return service.getPostsPlainJSON();
    }

}

