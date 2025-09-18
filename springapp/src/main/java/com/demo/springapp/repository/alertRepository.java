package com.demo.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.springapp.model.alert;

@Repository
public interface alertRepository extends JpaRepository<alert, Long> {
}
