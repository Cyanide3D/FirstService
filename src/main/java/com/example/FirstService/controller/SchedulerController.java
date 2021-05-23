package com.example.FirstService.controller;

import com.example.FirstService.model.Ship;
import com.example.FirstService.service.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/scheduler")
public class SchedulerController {

    @Autowired
    private SchedulerService schedulerService;

    @GetMapping
    public List<Ship> schedule() {
        return schedulerService.createSchedule();
    }

}
