package com.example;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import java.util.Properties;
public class Consumer {
    private final KafkaConsumer<String, String> consumer;
    public Consumer(Properties p) { consumer = new KafkaConsumer<>(p); }
}