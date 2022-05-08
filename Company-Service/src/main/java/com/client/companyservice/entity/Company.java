package com.client.companyservice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="company_name",length=100)
	private String companyName;

	@Column(name="profile_description",length=100)
	private String profileDescription;
	
	@ManyToOne
	@JoinColumn(name="business_stream_id",referencedColumnName = "id")
	private BusinessStream businessStream;

	@Column(name="establishment_date")
	@Temporal(TemporalType.DATE)
	private Date establishmentDate;
	
	@Column(name="company_website_url",length=500)
	private String companyWebsiteUrl;
}
