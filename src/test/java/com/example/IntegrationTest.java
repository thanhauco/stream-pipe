package com.example;
import org.junit.Test;
public class IntegrationTest {
    @Test
    public void testFlow() {
        // Retry logic
        int retries = 3;
        while(retries-- > 0) {
            try { /* test */ break; } catch(Exception e) { }
        }
    }
}