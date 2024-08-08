//package com.VotingFinal_System.entity;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//
//@Entity
//public class Candidate {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false)
//    private String candidateName;
//
//    @Column(nullable = false)
//    private String candidateParty;
//
//    @Column(nullable = false, length = 1000)
//    private String candidateBio;
//
////    @Column(nullable = false)
////   private String candidateImage; // Store the path or URL of the image
//
//    @ManyToOne
//    @JoinColumn(name = "election_id", nullable = false)
//    private Election election; // Assuming Election is another entity
//
//    // Default constructor
//    public Candidate() {}
//
//    // Parameterized constructor
//    public Candidate(String candidateName, String candidateParty, String candidateBio, String candidateImage, Election election) {
//        this.candidateName = candidateName;
//        this.candidateParty = candidateParty;
//        this.candidateBio = candidateBio;
//       // this.candidateImage = candidateImage;
//        this.election = election;
//    }
//
//    // Getters and setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getCandidateName() {
//        return candidateName;
//    }
//
//    public void setCandidateName(String candidateName) {
//        this.candidateName = candidateName;
//    }
//
//    public String getCandidateParty() {
//        return candidateParty;
//    }
//
//    public void setCandidateParty(String candidateParty) {
//        this.candidateParty = candidateParty;
//    }
//
//    public String getCandidateBio() {
//        return candidateBio;
//    }
//
//    public void setCandidateBio(String candidateBio) {
//        this.candidateBio = candidateBio;
//    }
//
////    public String getCandidateImage() {
////        return candidateImage;
////    }
//
//    public void setCandidateImage(String candidateImage) {
//        this.candidateImage = candidateImage;
//    }
//
//    public Election getElection() {
//        return election;
//    }
//
//    public void setElection(Election election) {
//        this.election = election;
//    }
//
//    @Override
//    public String toString() {
//        return "Candidate{" +
//                "id=" + id +
//                ", candidateName='" + candidateName + '\'' +
//                ", candidateParty='" + candidateParty + '\'' +
//                ", candidateBio='" + candidateBio + '\'' +
//                ", candidateImage='" + candidateImage + '\'' +
//                ", election=" + election +
//                '}';
//    }
//
//	public Candidate(Long id, String candidateName, String candidateParty, String candidateBio, String candidateImage,
//			Election election) {
//		super();
//		this.id = id;
//		this.candidateName = candidateName;
//		this.candidateParty = candidateParty;
//		this.candidateBio = candidateBio;
//		this.candidateImage = candidateImage;
//		this.election = election;
//	}
//    
//    
//}
