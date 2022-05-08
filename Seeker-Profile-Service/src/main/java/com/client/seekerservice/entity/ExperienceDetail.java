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
public class ExperienceDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OneToOne
	@JoinColumn(name="user_account_id",referencedColumnName = "userAccountId")
	private SeekerProfile seekerProfile;
	
	@Column(name="is_current_job",length=1)
	private char isCurrentJob;
	
	@Column(name="start_date")
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Column(name="end_date")
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	@Column(name="job_title",length = 50)
	private String jobTitle;
	
	@Column(name="company_name",length=100)
	private String companyName;
	
	@Column(name = "job_location_city",length = 50)
	private String jobLocationCity;
	
	@Column(name = "job_location_state",length = 50)
	private String jobLocationState;

	@Column(name = "job_location_country",length = 50)
	private String jobLocationCountry;
	
	@Column(length = 4000)
	private String description;
	
	
}

