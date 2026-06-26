package com.eks_kafka_consumer_app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.eks_kafka_consumer_app.model.OrderEvent;

@Service
public class OrderConsumerService {
    private static final Logger logger = LoggerFactory.getLogger(OrderConsumerService.class);

    @KafkaListener(topics = "orders-topic", groupId = "orders-group")
    public void consume(OrderEvent order) {
        logger.info("Successfully Consumed Event Order Id -> {}, Item -> {}, Status -> {}", 
                order.orderId(), order.item(), order.status());
    }
}