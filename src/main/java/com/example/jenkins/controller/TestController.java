package com.example.jenkins.controller;

import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@RestController
@RequestMapping
public class TestController {

    @RequestMapping
    public String index() {
        log.info("jenkins start success {}", this.getClass());
        return "jenkins start success";
    }

    @RequestMapping("/test")
    public String test() {
        log.info("jenkins test");
        return "jenkins test";
    }

    @RequestMapping("/obj")
    public String obj(String object) {
        try {
            System.out.println(object);
            System.out.println(object.equals("test"));
        } catch (Exception e) {
            for (int i = 0; i < 50; i++) {
                log.error("jenkins test error", e);
            }
        }
        return "jenkins test error";
    }
}
