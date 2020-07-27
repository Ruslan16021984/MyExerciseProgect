package com.gmail.carbit3333333.repository;

import com.gmail.carbit3333333.model.Basslocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasslocationReposiroty extends JpaRepository<Basslocation, Integer> {
    Basslocation findTopByOrderByIdDesc();

}
