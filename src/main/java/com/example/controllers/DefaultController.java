package com.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by j.zvirbulis on 30-06-2017.
 */
@RestController
public class DefaultController {

    @RequestMapping("/")
    String defaultResponse() {
        return "Home";
    }
}
