package com.sample.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.sample.domain.Login;
import com.sample.sample.repository.LoginRepo;

@Service
public class LoginService {
@Autowired
private LoginRepo repo;
public Login login(String username , String password){
Login user1= repo.findByUsernameAndPassword( username , password);
return user1;

}
}
