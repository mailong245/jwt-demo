package com.demo.jsonwebtoken.service.user;

import com.demo.jsonwebtoken.model.User;
import com.demo.jsonwebtoken.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    Optional<User> findByUsername(String username);
}