package com.client.seekerservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeekerSkillSet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@OneToOne
	@JoinColumn(name="user_account_id",referencedColumnName = "userAccountId")
	private SeekerProfile seekerProfile;
	
	@OneToOne
	@JoinColumn(name="skill_set_id",referencedColumnName = "id")
	private SkillSet skillSet;
	
	@Column(name="skill_level")
	private long skillLevel;
	
}
