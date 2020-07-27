package com.gmail.carbit3333333.model.questionsmodel;

import com.gmail.carbit3333333.model.CustomUser;
import com.gmail.carbit3333333.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private UserService userRepository;
    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        CustomUser customUser = userRepository.getUserByLogin(login);
        System.out.println(customUser.toString());
        if (customUser == null){
            System.out.println("not found");
            throw new UsernameNotFoundException(login + " not found");

        }
        Set<GrantedAuthority> roles = new HashSet<>();
        System.out.println(customUser.getUserRole().toString());
        roles.add(new SimpleGrantedAuthority(customUser.getUserRole().toString()));
        return new User(customUser.getUsername(), customUser.getPassword(), roles);
    }
}
