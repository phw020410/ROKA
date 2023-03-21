package com.example.demo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.dao.ROKAMapper;
import com.example.demo.model.dto.ROKA;

@Service
public class ROKAServiceImpl implements ROKAService {
    @Autowired
    ROKAMapper rokaMapper;

    @Override
    public List<ROKA> getAllData() {
        return rokaMapper.getAllData();
    }

    @Override
    public ROKA getUser(int seq) {
        return rokaMapper.getUser(seq);
    }

    @Override
    public void addUser(ROKA roka, int seq) {
        rokaMapper.addUser(roka, seq);
    }
}
