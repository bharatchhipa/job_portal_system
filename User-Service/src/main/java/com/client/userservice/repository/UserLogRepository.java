package com.client.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.userservice.entity.UserLog;

@Repository
public interface UserLogRepository extends JpaRepository<UserLog, Long> {

}
