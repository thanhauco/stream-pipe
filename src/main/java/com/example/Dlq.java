package com.example;
public class Dlq {
    public void send(String msg, Exception e) { System.err.println("DLQ: " + msg + " Error: " + e.getMessage()); }
}