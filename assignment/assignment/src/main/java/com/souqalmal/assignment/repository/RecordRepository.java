package com.souqalmal.assignment.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@Repository
public class RecordRepository {
    private LinkedList<String> recordList = new LinkedList<>();

    /**
     * Add items to recordList
     * @param name
     * @return String
     */
    public String add(String name){
          recordList.addFirst(name);
          log.debug("added the record successfully to the list ");
          return Collections.emptyList().toString();
    }

    /**
     * Returns 10 items from the recordList
     * @return List of string
     */
    public List<String> fetchLast10InputValues(){
          return listRecords().stream()
                  .limit(10).collect(Collectors.toList());
            }
    private List<String> listRecords() {
        return recordList;
        }

    /**
     * Retuens latest record
     * @return String
     */
    public String getLatestRecord() {
         return recordList.isEmpty() ? "null"
                 : recordList.getFirst();
    }
}

