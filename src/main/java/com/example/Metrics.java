package com.example;
import javax.management.MBeanServer;
import java.lang.management.ManagementFactory;
public class Metrics {
    public static void register() {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        // Register MBeans
    }
}