package com.example.rancher.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lichuandong
 * @Date 2021/1/14
 */
@RestController
public class RancherController {

    @RequestMapping("test")
    public String test(String name){
        return "我就是我："+ name;
    }
}
