package com.example;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;
import java.io.File;
public class AvroProcessor implements Processor {
    private Schema schema;
    public AvroProcessor() throws Exception { schema = new Schema.Parser().parse(new File("src/main/resources/user.avsc")); }
    public void process(String msg) throws Exception {
        // Mock deserialization
        System.out.println("Avro processed");
    }
}