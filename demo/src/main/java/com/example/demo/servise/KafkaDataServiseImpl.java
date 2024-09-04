package com.example.demo.servise;

import com.example.demo.model.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.kafka.sender.KafkaSender;

@Service
@RequiredArgsConstructor

public class KafkaDataServiseImpl implements KafkaDataServise {
    private final KafkaSender<String, Object> sender;

    @Override
    public void send(Data data) {

    }
}
