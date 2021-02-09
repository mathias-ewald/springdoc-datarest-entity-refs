package com.example.demo;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired
	private InvitationRepo iRepo;
	
	@Autowired
	private RoleRepo rRepo;
	
    public void run(ApplicationArguments args) {
        Role role = new Role();
        role.setName("Some Role");
        role.setPermissions(Set.of("create", "read"));
        role = rRepo.save(role);
        
        Invitation invitation = new Invitation();
        invitation.setEmail("foo@bar.com");
        invitation.setRole(role);
        iRepo.save(invitation);
    }

}
