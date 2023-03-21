package com.example.demo.model.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ROKA {
    private String userName;
    private String rank;
    private Date inDate;
    private Date outDate;
    private int seq;

    @Override
    public String toString() {
        return String.format("userName : %s, rank : %s, inDate : %s, outDate : %s, seq : %d", this.userName, this.rank, this.inDate, this.outDate, this.seq);
    }
}
