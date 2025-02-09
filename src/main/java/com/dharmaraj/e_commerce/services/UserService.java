package com.dharmaraj.e_commerce.services;

import com.dharmaraj.e_commerce.models.User;

public interface UserService {
    
    public User signupUser(String name, String email, String password) throws Exception;

    public boolean login(String email, String password) throws Exception;
}
