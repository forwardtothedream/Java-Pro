package com.hw9.phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {
    private List<Record> listArray = new ArrayList<>();

    public PhoneDirectory() {

    }

    public void add(Record listExm) {
        listArray.add(listExm);
    }

    public Record find(String name) {
        for (Record record : listArray
        ) {
            if (record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> allFind(String name) {
        List<Record> recordMethod = new ArrayList<>();
        for (Record record : listArray) {
            if (record.getName().equals(name)) {
                recordMethod.add((Record) listArray);
            }
        }
        if (recordMethod.isEmpty()) {
            return null;
        } else {
            return recordMethod;
        }
    }

}