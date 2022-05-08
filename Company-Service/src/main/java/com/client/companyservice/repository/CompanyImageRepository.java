package com.client.companyservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.companyservice.entity.CompanyImage;

@Repository
public interface CompanyImageRepository extends JpaRepository<CompanyImage, Long>{

}
