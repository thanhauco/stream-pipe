package com.example;
import java.util.Properties;
public class Config {
    private Properties p = new Properties();
    public Config bootstrap(String s) { p.put("bootstrap.servers", s); return this; }
    public Properties build() { return p; }
}