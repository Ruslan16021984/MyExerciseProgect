package com.gmail.carbit3333333.services;

import com.gmail.carbit3333333.model.Basslocation;
import com.gmail.carbit3333333.model.CustomUser;
import com.gmail.carbit3333333.repository.BasslocationReposiroty;
import com.gmail.carbit3333333.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationServiceImpl implements LocationService {
    private UserRepository userRepository;
    private BasslocationReposiroty basslocationReposiroty;

    @Override
    public List<CustomUser> findAll() {
        return userRepository.findAll();
    }

    @Override
    public CustomUser findByPassword(String password) {
        return userRepository.findByPassword(password);
    }

    @Override
    public CustomUser saveUser(CustomUser customUser) {
        return userRepository.save(customUser);
    }

    @Override
    public Basslocation saveLocation(Basslocation location) {
        return basslocationReposiroty.save(location);
    }

    @Override
    public Optional<Basslocation> getBasById(int id) {
        return basslocationReposiroty.findById(id);
    }
    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Autowired
    public void setBasslocationReposiroty(BasslocationReposiroty basslocationReposiroty) {
        this.basslocationReposiroty = basslocationReposiroty;
    }

    @Override
    public Basslocation findTopByByIdDesc() {
        return basslocationReposiroty.findTopByOrderByIdDesc();
    }
}
