package com.example;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.KStream;
public class StreamApp {
    public void build(StreamsBuilder builder) {
        KStream<String, String> source = builder.stream("input");
        source.mapValues(v -> v.toUpperCase()).to("output");
    }
}