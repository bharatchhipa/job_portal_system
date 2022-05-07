package com.client.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.userservice.entity.UserAccount;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount,Long> {

}
