package com.gmail.carbit3333333.services;

import com.gmail.carbit3333333.model.CustomUser;

public interface UserService {
    CustomUser getUserByLogin(String login);
    void addUser(CustomUser customUser);
    void updateUser(CustomUser customUser);
}
