package com.gmail.carbit3333333.services;

import com.gmail.carbit3333333.model.Basslocation;
import com.gmail.carbit3333333.model.CustomUser;

import java.util.List;
import java.util.Optional;

public interface LocationService {
    List<CustomUser> findAll();
    CustomUser findByPassword(String password);
    CustomUser saveUser(CustomUser customUser);
    Basslocation saveLocation(Basslocation location);
    Optional<Basslocation> getBasById(int id);
    Basslocation findTopByByIdDesc();
}
