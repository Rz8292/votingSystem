package com.example.votingsystem.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.votingsystem.entity.Candidate;

@Service
public class CandidateServices {
    private Map<String, Candidate> candidates = new HashMap<>();

    public void enterCandidate(String name) {
        candidates.put(name, new Candidate(name));
    }

    public int castVote(String name) {
        Candidate candidate = candidates.get(name);
        if (candidate != null) {
            candidate.setVoteCount(candidate.getVoteCount() + 1);
            return candidate.getVoteCount();
        }
        return -1; // Invalid candidate
    }

    public int countVote(String name) {
        Candidate candidate = candidates.get(name);
        return (candidate != null) ? candidate.getVoteCount() : -1; // Invalid candidate
    }

    public Map<String, Integer> listVote() {
        Map<String, Integer> result = new HashMap<>();
        candidates.forEach((name, candidate) -> result.put(name, candidate.getVoteCount()));
        return result;
    }

    public String getWinner() {
        Candidate winner = candidates.values().stream()
                .max((c1, c2) -> Integer.compare(c1.getVoteCount(), c2.getVoteCount()))
                .orElse(null);

        return (winner != null) ? winner.getName() : null;
    }

}
