package com.example.jenkins.test1.contronller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * test
 * </p >
 *
 * @author yinshu
 * @since 2021/1/18 14:55
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("test")
    public String test() {
        return "jenkins test";
    }
}
