package com.artplan.secondTask.exceptions;

import lombok.Data;

import java.util.*;

@Data
public class ServiceError {
    private int status;
    private List<String> messages;
    private Date timestamp;

    public ServiceError(int status, String... messages) {
        this.status = status;
        this.messages = new ArrayList<>(Arrays.asList(messages));
        this.timestamp = new Date();
    }

    public ServiceError(int status, Collection<String> messages) {
        this.status = status;
        this.messages = new ArrayList<>(messages);
        this.timestamp = new Date();
    }
}