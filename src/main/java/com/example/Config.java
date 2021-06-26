package com.example;
public class Config {
    public String getEnv(String key, String def) {
        String val = System.getenv(key);
        return val != null ? val : def;
    }
}