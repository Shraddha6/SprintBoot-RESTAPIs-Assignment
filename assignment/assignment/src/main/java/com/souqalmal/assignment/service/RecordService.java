package com.souqalmal.assignment.service;

import com.souqalmal.assignment.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;
import java.util.List;

@Service
public class RecordService {

    @Autowired
    private RecordRepository recordRepository;

    public String addRecord(String name) {
        return recordRepository.add(name);
    }

    public List<String> getRecords() {
        return recordRepository.fetchLast10InputValues();
    }

    public String getLatestRecord(){
        return recordRepository.getLatestRecord();
    }
}
