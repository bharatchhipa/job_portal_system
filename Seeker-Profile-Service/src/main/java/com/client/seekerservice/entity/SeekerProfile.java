package com.client.seekerservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeekerProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long seekerProfileId;
	
	@Column(name="user_account_id")
	private long userAccountId;
	
	@Column(name="fisrt_name",length=50)
	private String firstName;
	
	@Column(name="last_name",length=50)
	private String lastName;
}
