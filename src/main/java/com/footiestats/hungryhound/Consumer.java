package com.footiestats.hungryhound;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

import org.springframework.stereotype.Service;

@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "footie23", groupId = "jacek-japila-pl")
    public void consume(String message){

        logger.info(String.format("$$$ -> Consumed Message -> %s",message));

    }
}