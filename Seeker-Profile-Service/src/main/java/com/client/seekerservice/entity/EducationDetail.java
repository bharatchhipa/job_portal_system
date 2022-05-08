package com.client.seekerservice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OneToOne
	@JoinColumn(name="user_account_id",referencedColumnName = "userAccountId")
	private SeekerProfile seekerProfile;
	
	@Column(name="certificate_degree_name",length=50)
	private String certificateDegreeName;
	
	@Column(name="major",length = 50)
	private String major;
	
	@Column(name="institue_university_name",length=50)
	private String instituteUniversityName;
	
	@Column(name="starting_date")
	@Temporal(TemporalType.DATE)
	private Date startingDate;
	
	@Column(name="completion_date")
	@Temporal(TemporalType.DATE)
	private Date completionDate;
	
	private double percentage;
	
	
}
