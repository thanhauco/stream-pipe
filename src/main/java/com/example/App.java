package com.example;
public class App {
    public static void main(String[] args) {
        Properties p = new Config().bootstrap("localhost:9092").build();
        // ... rest
    }
}