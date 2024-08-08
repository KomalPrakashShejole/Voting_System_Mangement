package com.VotingFinal_System.entity;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Election {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String electionTitle;

    @Column(nullable = false, length = 500)
    private String electionDescription;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    // Default constructor
    public Election() {}

    // Parameterized constructor
    public Election(String electionTitle, String electionDescription, LocalDate startDate, LocalDate endDate) {
        this.electionTitle = electionTitle;
        this.electionDescription = electionDescription;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getElectionTitle() {
        return electionTitle;
    }

    public void setElectionTitle(String electionTitle) {
        this.electionTitle = electionTitle;
    }

    public String getElectionDescription() {
        return electionDescription;
    }

    public void setElectionDescription(String electionDescription) {
        this.electionDescription = electionDescription;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Election{" +
                "id=" + id +
                ", electionTitle='" + electionTitle + '\'' +
                ", electionDescription='" + electionDescription + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
