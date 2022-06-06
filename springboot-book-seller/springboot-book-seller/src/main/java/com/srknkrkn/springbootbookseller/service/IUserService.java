package com.srknkrkn.springbootbookseller.service;

import com.srknkrkn.springbootbookseller.model.User;

import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    //changing current user role to admin//
    void makeAdmin(String username);
}
