package com.client.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.userservice.entity.UserType;

@Repository
public interface UserTypeRepository extends JpaRepository<UserType, Long> {

}
