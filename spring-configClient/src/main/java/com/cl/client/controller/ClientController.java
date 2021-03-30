package com.cl.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ClientController {
    /**
     * @Value 从配置文件中去除对于的配置项
     */
    @Value("${word}")
    private  String word;

    @GetMapping("/test")
    public String test(@RequestParam String name){
        return name+"："+this.word;
    }

}
