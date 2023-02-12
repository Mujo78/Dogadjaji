package com.example.dogadjaj181.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.dogadjaj181.models.entities.User;
import com.example.dogadjaj181.repository.UserRepository;

@Service
public class UserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository _UserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final User user = _UserRepository.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        UserDetails newUser;
        if(user.getRoleID() == 0) newUser = org.springframework.security.core.userdetails.User.withUsername(user.getEmail()).password(user.getSifra()).authorities("USER").build();
        else newUser = org.springframework.security.core.userdetails.User.withUsername(user.getEmail()).password(user.getSifra()).authorities("ADMIN").build();
        return newUser;
    }
}