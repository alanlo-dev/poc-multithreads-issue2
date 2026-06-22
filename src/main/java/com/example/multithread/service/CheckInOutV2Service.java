package com.example.multithread.service;

import org.springframework.stereotype.Service;

import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class CheckInOutV2Service {

    private final AtomicInteger atomicCounter = new AtomicInteger(0);
    private final Hashtable<String, String> data = new Hashtable<String, String>();

    public void checkIn() {
        atomicCounter.incrementAndGet();
    }

    public void checkOut() {
        atomicCounter.decrementAndGet();
    }
    
    public int getCounter() {
        return atomicCounter.get();
    }

    public String updateData(String key, String value) {
        return data.put(key, value);
    }

    public String getData(String key) {
        return data.get(key);
    }
}
