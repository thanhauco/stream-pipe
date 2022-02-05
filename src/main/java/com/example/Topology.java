package com.example;
import org.apache.kafka.streams.StreamsBuilder;
public class Topology {
    public static void build(StreamsBuilder builder) {
        builder.stream("input").to("output");
    }
}