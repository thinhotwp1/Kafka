package com.example.product_kafka.config;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class MessageProducer {

    // đăng ký topic log của service của kafka để nhận log và từ đó có thể đẩy lên elk để tra log
    private static final String TOPIC_KAFKA_SERVICE = "log_kafka_service";
    private static final String TOPIC_EKYC_SERVICE = "log_ekyc_service";


    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessageKafka(String message) {
        log.info("Message: "+message);
        kafkaTemplate.send(TOPIC_KAFKA_SERVICE, message);
    }
    public void sendMessageEkyc(String message) {
        log.info("Message: "+message);
        kafkaTemplate.send(TOPIC_EKYC_SERVICE, message);
    }

}