package com.demo.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.springapp.model.user;
    @Repository
public interface userRepository extends JpaRepository<user, Long> {
 }


