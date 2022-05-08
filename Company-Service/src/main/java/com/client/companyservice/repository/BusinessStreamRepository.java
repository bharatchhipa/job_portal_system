package com.client.companyservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.companyservice.entity.BusinessStream;

@Repository
public interface BusinessStreamRepository extends JpaRepository<BusinessStream, Long> {

}
