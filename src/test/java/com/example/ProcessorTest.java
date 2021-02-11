package com.example;
import org.junit.Test;
public class ProcessorTest {
    @Test(expected = Exception.class)
    public void testInvalidJson() throws Exception {
        new JsonProcessor().process("invalid");
    }
}