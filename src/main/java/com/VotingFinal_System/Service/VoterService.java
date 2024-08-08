package com.VotingFinal_System.Service;

import java.util.List;

import com.VotingFinal_System.entity.Voter;

public interface VoterService {
    public Voter saveVoter(Voter voter);
    public List<Voter> voterlist();
    public void deleteById(int id);
    public Voter findById(int id);
    public Voter updateVoter(Voter voter, int id);
    public Voter findByUsername(String username);
    public List<Voter> getAllVoters();
}
