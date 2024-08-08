package com.VotingFinal_System.Contoller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.VotingFinal_System.Repository.AdminRepository;
import com.VotingFinal_System.Service.AdminService;
import com.VotingFinal_System.entity.Admin;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class AdminController {

    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private AdminService adminService;

    @Autowired
    private AdminRepository adminRepo;

    @GetMapping("/adminRegistration")
    public String adminRegistration(Model model) {
        model.addAttribute("admin", new Admin());
        return "adminRegistration";
    }

    @PostMapping("/goadminregister")
    public String getAdminStatus(@Valid @ModelAttribute("admin") Admin admin, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "adminRegistration";
        }
        adminService.saveAdmin(admin);
        return "redirect:/adminlogin";
    }

    @PostMapping("/adminlogin")
    public String handleAdminLogin1(@ModelAttribute Admin admin, Model model) {
        Optional<Admin> existingAdminOpt = adminRepo.findByUsername(admin.getUsername());

        if (existingAdminOpt.isPresent()) {
            Admin existingAdmin = existingAdminOpt.get(); 
            logger.info("Attempting to login admin with username: {}", admin.getUsername());
            
            if (existingAdmin.getPassword().equals(admin.getPassword())) {
                return "home";
            } else {
                logger.warn("Password mismatch for admin with username: {}", admin.getUsername());
            }
        } else {
            logger.warn("No admin found with username: {}", admin.getUsername());
        }

        model.addAttribute("error", true);
        return "adminlogin";
    }

    @GetMapping("/adminlogin")
    public String adminHome() {
        return "adminlogin";
    }
    @GetMapping("/home")
    public String adminDashboard() {
        return "home"; // The name of the HTML file without the extension
    } 
    
}
