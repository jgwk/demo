package jgwk.kafka;

import lombok.extern.java.Log;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Log
@Service
public class TestConsumer {

    @KafkaListener(topics = "test-hello", groupId = "test")
    public void consumeTestHello(String message) {
        log.info("consume test-hello: " + message);
    }
}
