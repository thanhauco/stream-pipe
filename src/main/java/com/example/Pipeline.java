package com.example;
import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.Counter;
public class Pipeline {
    private final Counter processed = Metrics.counter("pipeline.processed");
    // ... existing
    public void start() {
        consumer.poll(msg -> {
            processed.increment();
            // ... rest
        });
    }
}