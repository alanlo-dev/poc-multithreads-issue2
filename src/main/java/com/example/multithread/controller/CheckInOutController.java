package com.example.multithread.controller;

import com.example.multithread.service.CheckInOutService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/checkInOut")
public class CheckInOutController {

    private final CheckInOutService checkInOutService;

    public CheckInOutController(CheckInOutService checkInOutService) {
        this.checkInOutService = checkInOutService;
    }

    @PostMapping("/in")
    public void checkIn() throws InterruptedException {
        checkInOutService.checkIn();
    }

    @PostMapping("/out")
    public void checkOut() throws InterruptedException {
        checkInOutService.checkOut();
    }

}
