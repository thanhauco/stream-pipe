package com.example;
import org.junit.Test;
import org.testcontainers.containers.KafkaContainer;
import org.testcontainers.utility.DockerImageName;
public class IntegrationTest {
    @Test
    public void testFlow() {
        try(KafkaContainer kafka = new KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka:5.4.3"))) {
            kafka.start();
            // Test logic
        }
    }
}