package com.client.userservice.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAccount {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@OneToOne
	@JoinColumn(name="user_type_id",referencedColumnName = "id")
	private UserType userType;
	
	@Column(name="email",length = 255)
	private String email;
	
	@Column(name="password",length = 255)
	private String password;
	
	@Column(name="date_of_birth")
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
	@Column(name="gender",length=1)
	private char gender;
	
	@Column(name="is_active",length=1)
	private char isActive;
	
	@Column(name="contact_number",length=10)
	private long contactNumber;
	
	@Column(name ="sms_notification_active",length=1)
	private char smsNotificationActive;
	
	@Column(name ="email_notification_active",length=1)
	private char emailNotificationActive;
	
	@Lob
    @Column(name = "photo", columnDefinition="BLOB")
    private byte[] photo;
	
	@CreationTimestamp
	@Column(name="created_date")
	private Date createdDate;
	
	@UpdateTimestamp
	@Column(name="modified_date")
	private Date modifiedDate;
	
	
}
