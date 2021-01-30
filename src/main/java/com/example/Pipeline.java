package com.example;
public class Pipeline {
    private final ConsumerWrapper consumer;
    private final Processor processor;
    private final Dlq dlq;
    public Pipeline(ConsumerWrapper c, Processor p, Dlq d) { consumer = c; processor = p; dlq = d; }
    public void start() {
        consumer.subscribe("input");
        while(true) {
            consumer.poll(msg -> {
                try { processor.process(msg); }
                catch(Exception e) { dlq.send(msg, e); }
            });
        }
    }
}