package com.example.demo.servise;

import com.example.demo.model.Data;

public interface KafkaDataServise {
    void send(Data data);
}
