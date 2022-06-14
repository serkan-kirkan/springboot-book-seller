package com.srknkrkn.springbootbookseller.service;

import com.srknkrkn.springbootbookseller.model.Role;
import com.srknkrkn.springbootbookseller.model.User;
import com.srknkrkn.springbootbookseller.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserService implements IUserService
{
    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    //user saving//
    @Override
    public User saveUser(User user)
    {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setCreateTime(LocalDateTime.now());

        return userRepository.save(user);
    }


    //finding user//
    @Override
    public Optional<User> findByUsername(String username)
    {
        return userRepository.findByUsername(username);
    }

    //changing current user role to admin//
    @Override
    //transactional is obligatory when executing update or delete query //
    @Transactional
    public void makeAdmin(String username)
    {
        userRepository.updateUserRole(username, Role.ADMIN);
    }

}
