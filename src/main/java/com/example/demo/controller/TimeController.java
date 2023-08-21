package com.example.demo.controller;

import com.example.demo.config.Result;
import com.example.demo.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/time")
public class TimeController {

    @Autowired
    TimeService timeServiceImpl;

    @GetMapping("/distanceDate")
    public Result<Number> getDistanceDate(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate endDate){
        Number number = timeServiceImpl.distanceDate(startDate,endDate);
        return Result.success(number);
    }
}
