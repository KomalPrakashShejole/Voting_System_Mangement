package com.VotingFinal_System.entity;

import java.sql.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
public class Voter {
	
	@Id
	@GeneratedValue (strategy= GenerationType.AUTO)
	private int id;
	@NotBlank(message ="Name Cannot to Blank")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "only characters allowed")
    
    private String VoterName;
	private Date DOB;
	private String gender;
	private String username;
	private String password;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the voterName
	 */
	public String getVoterName() {
		return VoterName;
	}
	/**
	 * @param voterName the voterName to set
	 */
	public void setVoterName(String voterName) {
		VoterName = voterName;
	}
	/**
	 * @return the dOB
	 */
	public Date getDOB() {
		return DOB;
	}
	/**
	 * @param dOB the dOB to set
	 */
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	public Voter(int id,
			@NotBlank(message = "Name Cannot to Blank") @Pattern(regexp = "^a-zA-Z+$", message = "only characters allowed") String voterName,
			Date dOB, String gender, String username, String password) {
		super();
		this.id = id;
		VoterName = voterName;
		DOB = dOB;
		this.gender = gender;
		this.username = username;
		this.password = password;
	}
	public Voter() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Voter [id=" + id + ", VoterName=" + VoterName + ", DOB=" + DOB + ", gender=" + gender + ", username="
				+ username + ", password=" + password + "]";
	}
	
}
