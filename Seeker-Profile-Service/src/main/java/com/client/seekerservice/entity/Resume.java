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
public class Resume {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="resume_id")
	private long id;
	
	@Column(name="file_path")
	private String filePath;
		
	@Column(name="upload_date")
	@Temporal(TemporalType.DATE)
	private Date uploadDate;
	
	private int status;
	
	@OneToOne
	@JoinColumn(name="user_account_id",referencedColumnName = "userAccountId")
	private SeekerProfile seekerProfile;

	

}
