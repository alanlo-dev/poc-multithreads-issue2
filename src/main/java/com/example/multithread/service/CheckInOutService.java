package com.example.multithread.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class CheckInOutService {

    private int counter = 0;
    private final HashMap<String, String> data = new HashMap<String, String>();

    public void checkIn() {
        counter++;
    }

    public void checkOut() {
        counter--;
    }

    public int getCounter() {
        return counter;
    }

    public String updateData(String key, String value) {
        return data.put(key, value);
    }

    public String getData(String key) {
        return data.get(key);
    }
}
