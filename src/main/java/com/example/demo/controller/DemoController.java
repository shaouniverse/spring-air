package com.example.demo.controller;

import com.example.demo.config.Result;
import com.example.demo.entity.TestObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@Slf4j
public class DemoController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "hello World!";
    }

    @GetMapping("/getTestObject")
    public Result<TestObject> getTestObject(){
        TestObject testObject = new TestObject();
        testObject.setStr("Str啊");
        testObject.setIntNum(9);
        testObject.setLongStr("查撒旦发射点发射点发生aaaaaaaa");

        return Result.success(testObject);
    }
}
