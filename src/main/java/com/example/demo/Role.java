package com.example.demo;

import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
@Entity
public class Role {
	
	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	private String name;
	
	@ElementCollection
	private Set<String> permissions;
	
}
