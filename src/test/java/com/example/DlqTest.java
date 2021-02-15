package com.example;
import org.junit.Test;
public class DlqTest {
    @Test
    public void testSend() {
        new Dlq().send("msg", new Exception("fail"));
    }
}