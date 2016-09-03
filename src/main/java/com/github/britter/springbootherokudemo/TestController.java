package com.github.britter.springbootherokudemo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "test")
public class TestController {


    @RequestMapping(method = RequestMethod.GET, path = "/{message}")
    public void test(@PathVariable String message) {

        System.out.println(message);
    }
}
