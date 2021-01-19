package com.example;
public class Pipeline {
    private final Consumer consumer;
    private final Processor processor;
    public Pipeline(Consumer c, Processor p) { consumer = c; processor = p; }
    public void start() {
        consumer.subscribe("input");
        // loop logic needs refactor to accept callback
    }
}