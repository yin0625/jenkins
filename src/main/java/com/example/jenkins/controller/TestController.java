package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Test
 * </p >
 *
 * @author yinshu
 * @since 2021/1/18 15:55
 */
@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping
    public String test(){
        return "jenkins test";
    }
}