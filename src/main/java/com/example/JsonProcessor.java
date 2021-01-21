package com.example;
public class JsonProcessor implements Processor {
    public void process(String msg) throws Exception {
        if(!msg.startsWith("{")) throw new Exception("Invalid JSON");
        System.out.println("Processed JSON: " + msg);
    }
}