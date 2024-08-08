package com.VotingFinal_System.entity;

import java.sql.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "admins")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank(message = "Name cannot be empty")
    @Size(min = 4, max = 8, message = "Name should have 4 to 8 characters")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Only characters allowed")
    private String name;

    private String username;
    private String password;
    private String address;
    private String gender;
    private Date BOB;

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBOB() {
        return BOB;
    }

    public void setBOB(Date BOB) {
        this.BOB = BOB;
    }

    // Constructors

    public Admin(int id,
                 @NotBlank(message = "Name cannot be empty") @Size(min = 4, max = 8, message = "Name should have 4 to 8 characters") @Pattern(regexp = "^[a-zA-Z]+$", message = "Only characters allowed") String name,
                 String username, String password, String address, String gender, Date BOB) {
        super();
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.address = address;
        this.gender = gender;
        this.BOB = BOB;
    }

    public Admin() {
        super();
    }

    @Override
    public String toString() {
        return "Admin [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", address="
                + address + ", gender=" + gender + ", BOB=" + BOB + "]";
    }

	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
}
