package com.example;
public class App {
    public static void main(String[] args) throws Exception {
        new HealthServer().start();
        System.out.println("Health Server Started");
        // Start pipeline in separate thread
    }
}