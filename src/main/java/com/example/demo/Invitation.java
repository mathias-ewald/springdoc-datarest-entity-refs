package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
@Entity
public class Invitation {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String email;
	
	@ManyToOne
	@NotNull
	private Role role;

}
