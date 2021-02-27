package com.example;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.TimeWindows;
import java.time.Duration;
public class StreamApp {
    public void build(StreamsBuilder builder) {
        KStream<String, String> source = builder.stream("input");
        source.groupByKey().windowedBy(TimeWindows.of(Duration.ofMinutes(1))).count();
    }
}