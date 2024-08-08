package com.VotingFinal_System.Service;

import java.util.List;

import com.VotingFinal_System.entity.Admin;

public interface AdminService {
	public void saveAdmin(Admin admin);
	public List <Admin> adminList();
	List<Admin> findByUsername(String username, String password);
	Admin loginAdmin(String username, String password);
	List<Admin> adminlist();

//	List<Admin> finfByEmailPasswordt(String username,String password);
//	List<Admin> adminlist();
//	public Admin loginAdmin(String username, String password);
	

}
