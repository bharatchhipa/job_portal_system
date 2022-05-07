package com.client.userservice.entity;

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

@Entity
public class UserLog {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OneToOne
	@JoinColumn(name="user_account_id",referencedColumnName = "id")
	private UserAccount userAccount;
	
	@Temporal(TemporalType.DATE)
	@Column(name="last_login_date")
	private Date lastLoginDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="last_job_apply_date")
	private Date lastJobApplyDate;
	

}
