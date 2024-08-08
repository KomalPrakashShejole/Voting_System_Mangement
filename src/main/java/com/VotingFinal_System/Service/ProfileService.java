package com.VotingFinal_System.Service;

import com.VotingFinal_System.entity.Profile;

public interface ProfileService {
	
	public Profile setProfile(Profile profile);
	
	public Profile getById(int id);
	
	public boolean existById(int id);

}
