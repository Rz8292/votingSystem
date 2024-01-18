package com.example.votingsystem.entity;

import lombok.Data;

@Data
public class Candidate {
    private String name;
    private int voteCount;
    
    public Candidate() {
    }

    public Candidate(String name) {
        this.name = name;
    }
    
}
