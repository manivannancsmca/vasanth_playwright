package com.eks_kafka_consumer_app.model;

public record OrderEvent(String orderId, String item, double price, String status) {}