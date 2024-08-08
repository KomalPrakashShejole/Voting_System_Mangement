package com.VotingFinal_System.entity;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Profile {
	@Id
	private int id;
	
	@Lob
	@Column (name="profile",length=10000)
	private byte[] image;

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
	 * @return the image
	 */
	public byte[] getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(byte[] image) {
		this.image = image;
	}

	public Profile(int id, byte[] image) {
		super();
		this.id = id;
		this.image = image;
	}

	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Profile [id=" + id + ", image=" + Arrays.toString(image) + "]";
	}
	
	
	

}
