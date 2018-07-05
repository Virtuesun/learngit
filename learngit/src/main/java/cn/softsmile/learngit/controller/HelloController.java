package cn.softsmile.learngit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lideyang
 * @date 2018/7/5
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello git.";
    }
}
