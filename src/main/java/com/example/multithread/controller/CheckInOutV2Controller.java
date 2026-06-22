package com.example.multithread.controller;

import com.example.multithread.service.CheckInOutV2Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/checkInOut")
public class CheckInOutV2Controller {

    private final CheckInOutV2Service checkInOutService;

    public CheckInOutV2Controller(CheckInOutV2Service checkInOutService) {
        this.checkInOutService = checkInOutService;
    }

    @PostMapping("/in")
    public void checkIn() throws InterruptedException {
        checkInOutService.checkIn();
    }

    @PostMapping("/out")
    public void checkOut() throws InterruptedException {
        checkInOutService.checkIn();
    }
}
