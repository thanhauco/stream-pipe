package com.example;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import java.time.Duration;
import java.util.Collections;
import java.util.Properties;
public class Consumer {
    private final KafkaConsumer<String, String> consumer;
    public Consumer(Properties p) { consumer = new KafkaConsumer<>(p); }
    public void subscribe(String topic) { consumer.subscribe(Collections.singletonList(topic)); }
    public void run() {
        while(true) {
            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
            records.forEach(r -> System.out.println(r.value()));
        }
    }
}