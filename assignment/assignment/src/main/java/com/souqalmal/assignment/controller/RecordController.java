package com.souqalmal.assignment.controller;

import com.souqalmal.assignment.model.RequestRecord;
import com.souqalmal.assignment.model.ResponseRecord;
import com.souqalmal.assignment.service.RecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
public class RecordController {

    @Autowired
    RecordService recordService;

    /**
     * An API to add value to the list
     * RequestBody RequestRecord : It has name as an input
     * @return ResponseRecord : returns output: previous value from the list
     */
    @PostMapping("/track/trackValue")
    public ResponseRecord addTrackValue(@RequestBody RequestRecord record) throws Exception {
        ResponseRecord responseRecord = new ResponseRecord();
        try {
            responseRecord.setOutput(recordService.getLatestRecord());
            new ResponseEntity(recordService.addRecord(record.getInput()),HttpStatus.OK);
            log.info("added the record successfully to the list ");
        } catch (Exception ex) {
            log.error("error in adding record : {} ",ex.getCause());
            throw new Exception("error in adding record");
        }
        return responseRecord;
    }

    /**
     * An API to get last 10 input values from the list
     * @return ResponseEntity : returns from the latest 10 records from the list
     */
    @GetMapping("/track/getHistory")
    public ResponseEntity getTrackHistory(){
        return new ResponseEntity<>(recordService.getRecords(), HttpStatus.OK);
    }
}
