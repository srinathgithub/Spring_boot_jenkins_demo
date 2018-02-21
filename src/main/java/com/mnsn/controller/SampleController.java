package com.mnsn.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/info")
    public String getAppInfo(){
        String info="Sample Jenkins Demo Apps";
        return info;
    }
}
