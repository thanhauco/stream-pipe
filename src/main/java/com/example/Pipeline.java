package com.example;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Pipeline {
    private final ExecutorService pool = Executors.newFixedThreadPool(4);
    // ... existing
    public void start() {
        consumer.poll(msg -> pool.submit(() -> processor.process(msg)));
    }
}