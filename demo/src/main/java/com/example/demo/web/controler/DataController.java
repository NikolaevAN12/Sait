package com.example.demo.web.controler;

import com.example.demo.model.Data;
import com.example.demo.servise.KafkaDataServise;
import com.example.demo.web.dto.DataDto;
import com.example.demo.web.mapper.DataMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {

    private final KafkaDataServise kafkaDataServise;
    private final DataMapper dataMapper;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dto) {

        Data data = dataMapper.toEntity(dto);
        kafkaDataServise.send(data);
    }
}
