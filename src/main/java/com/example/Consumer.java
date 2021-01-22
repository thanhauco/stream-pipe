package com.example;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import java.time.Duration;
import java.util.Collections;
import java.util.Properties;
import java.util.function.Consumer;
public class ConsumerWrapper {
    private final KafkaConsumer<String, String> consumer;
    public ConsumerWrapper(Properties p) { consumer = new KafkaConsumer<>(p); }
    public void subscribe(String topic) { consumer.subscribe(Collections.singletonList(topic)); }
    public void poll(Consumer<String> callback) {
        ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
        records.forEach(r -> callback.accept(r.value()));
    }
}