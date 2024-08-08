package com.VotingFinal_System.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VotingFinal_System.Repository.AdminRepository;
import com.VotingFinal_System.entity.Admin;

@Service
public class AdminServiceImp implements AdminService {
    
    @Autowired
    AdminRepository adminRepository;
    
    @Override
    public void saveAdmin(Admin admin) {
        adminRepository.save(admin);
    }
    
    @Override
    public List<Admin> adminlist() {
        return adminRepository.findAll();
    }

    @Override
    public List<Admin> adminList() {
        // Implement the method as needed
        return null;
    }

    @Override
    public List<Admin> findByUsername(String username, String password) {
        // Implement the method as needed
        return null;
    }

	@Override
	public Admin loginAdmin(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}
