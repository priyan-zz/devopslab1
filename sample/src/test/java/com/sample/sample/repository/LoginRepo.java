package com.sample.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.sample.domain.Login;

@Repository
public interface LoginRepo extends JpaRepository<Login,String>{
Login findByUsernameAndPassword(String username, String password );
    
} 
