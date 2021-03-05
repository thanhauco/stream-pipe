package com.example;
public class Retry {
    public void sendToRetry(String msg) {
        // Send to retry-topic
        System.out.println("Retrying: " + msg);
    }
}