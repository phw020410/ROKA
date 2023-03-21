package com.example.demo.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.dto.ROKA;

@Mapper
@Repository
public interface ROKAMapper {
    List<ROKA> getAllData();

    ROKA getUser(int seq);

    void addUser(@Param(value = "roka") ROKA roka, int seq);
}
