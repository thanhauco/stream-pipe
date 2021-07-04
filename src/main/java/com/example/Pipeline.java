package com.example;
import java.util.concurrent.TimeUnit;
public class Pipeline {
    // ... existing
    public void stop() throws InterruptedException {
        pool.shutdown();
        pool.awaitTermination(5, TimeUnit.SECONDS);
    }
}