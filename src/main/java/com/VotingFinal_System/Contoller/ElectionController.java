package com.VotingFinal_System.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.VotingFinal_System.Service.ElectionService;
import com.VotingFinal_System.entity.Election;

@Controller
@RequestMapping("/elections")
public class ElectionController {

    @Autowired
    private ElectionService electionService;

    @GetMapping("/addElection")
    public String showAddElectionForm(Model model) {
        model.addAttribute("election", new Election());
        return "addElection";
    }

    @PostMapping("/addElection")
    public String addElection(Election election) {
        electionService.saveElection(election);
        return "redirect:/home";
    }
    
    @GetMapping("/elections/view")
    public String viewElections(Model model) {
        List<Election> elections = electionService.getAllElections();
        model.addAttribute("elections", elections);
        return "viewElections";
}
}