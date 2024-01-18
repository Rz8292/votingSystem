package com.example.votingsystem.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.votingsystem.services.CandidateServices;

@RestController
public class VoteSystemController {
    @Autowired
    private CandidateServices candidateServices;

    @GetMapping("/entercandidate")
    public void enterCandidate(@RequestParam String name) {
        candidateServices.enterCandidate(name);
        System.out.println("entercandidate");
    }

    @GetMapping("/castvote")
    public Integer castVote(@RequestParam String name) {
        System.out.println("castvote");
        return candidateServices.castVote(name);
    }
    
    @GetMapping("/countvote")
    public Integer countVote(@RequestParam String name) {
        System.out.println("countvote");
        return candidateServices.countVote(name);
    }
    
    @GetMapping("/listvote")
    public Map<String, Integer> listVote() {
        System.out.println("listvote");
        return candidateServices.listVote();
    }

    @GetMapping("/getwinner")
    public String getWinner() {
        return candidateServices.getWinner();
    }

}
