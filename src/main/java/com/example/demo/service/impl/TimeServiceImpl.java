package com.example.demo.service.impl;

import com.example.demo.service.TimeService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Service
public class TimeServiceImpl implements TimeService {

    @Override
    public Number distanceDate(LocalDate startDate, LocalDate endDate) {

        long between = ChronoUnit.DAYS.between(startDate, endDate);
        return between;
    }

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 3, 1);
        LocalDate endDate = LocalDate.of(2023, 3, 2);

        TimeServiceImpl timeService = new TimeServiceImpl();
        Number number = timeService.distanceDate(startDate, endDate);
        System.out.println(number);
    }
}
