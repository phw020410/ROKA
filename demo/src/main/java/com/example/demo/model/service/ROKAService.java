package com.example.demo.model.service;

import java.util.List;

import com.example.demo.model.dto.ROKA;

public interface ROKAService {
    List<ROKA> getAllData();

    ROKA getUser(int seq);

    void addUser(ROKA roka, int seq);
}
