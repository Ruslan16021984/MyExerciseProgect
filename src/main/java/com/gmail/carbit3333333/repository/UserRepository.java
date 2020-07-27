package com.gmail.carbit3333333.repository;

import com.gmail.carbit3333333.model.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<CustomUser, Long> {
    @Query("select b from CustomUser b where b.password = :password")
    CustomUser findByPassword(String password);
    @Query("select b from CustomUser b where b.username = :username")
    CustomUser getUserByUsername(@Param("username") String username);

}
