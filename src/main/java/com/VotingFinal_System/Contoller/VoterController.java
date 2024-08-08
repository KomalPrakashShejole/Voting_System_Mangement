package com.VotingFinal_System.Contoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.VotingFinal_System.Service.VoterService;
import com.VotingFinal_System.entity.Voter;

import jakarta.validation.Valid;

@Controller
public class VoterController {

    @Autowired
    private VoterService voterService;

    @GetMapping("/voterRegistration")
    public String voterRegistration(Model model) {
        model.addAttribute("voter", new Voter());
        return "voterregistration";
    }

    @PostMapping("/govoterregister")
    public String getVoterStatus(@Valid @ModelAttribute("voter") Voter voter, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "voterregistration";
        }
        voterService.saveVoter(voter);
        return "redirect:/voterlogin";
    }

    @PostMapping("/voterlogin")
    public String handleVoterLogin(@ModelAttribute Voter voter, Model model) {
        Voter existingVoter = voterService.findByUsername(voter.getUsername());

        if (existingVoter != null && existingVoter.getPassword().equals(voter.getPassword())) {
            return "voterHome";
        }

        model.addAttribute("error", true);
        return "voterlogin";
    }

    @GetMapping("/voterlogin")
    public String voterHome() {
        return "voterlogin";
    }

    @GetMapping("/voterlist")
    public String getVoters(Model model) {
        List<Voter> voterList = voterService.getAllVoters();
        model.addAttribute("voterlist", voterList);
        return "voterlist";
    }

    @GetMapping("/voters/update/{id}")
    public String showUpdateForm(@PathVariable("id") int id, Model model) {
        Voter voter = voterService.findById(id);
        if (voter != null) {
            model.addAttribute("voter", voter);
            return "update-voter";
        }
        return "redirect:/voterlist";
    }

    @PostMapping("/voters/update/{id}")
    public String updateVoter(@PathVariable("id") int id, @ModelAttribute Voter voter) {
        voterService.updateVoter(voter, id);
        return "redirect:/voterlist";
    }

    @GetMapping("/voters/delete/{id}")
    public String deleteVoter(@PathVariable("id") int id) {
        voterService.deleteById(id);
        return "redirect:/voterlist";
    }
}
