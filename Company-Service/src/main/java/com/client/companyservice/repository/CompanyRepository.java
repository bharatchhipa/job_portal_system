package com.client.companyservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.companyservice.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
