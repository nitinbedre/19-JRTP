package com.example.group.artifact.repository;

import org.springframework.stereotype.Repository;

import com.example.group.artifact.domain.User;

import org.springframework.data.jpa.repository.*;

@Repository
public interface UserRepository extends JpaRepository<User, String>, JpaSpecificationExecutor<User> {

    User findByUsername(String username);
   
}
