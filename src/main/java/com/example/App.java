package com.example;
public class App {
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("Shutting down...")));
        // ... rest
    }
}