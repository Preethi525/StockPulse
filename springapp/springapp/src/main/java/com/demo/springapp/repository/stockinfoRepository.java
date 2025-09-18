package com.demo.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.springapp.model.stockinfo;

@Repository
public interface stockinfoRepository extends JpaRepository<stockinfo, Long> {
}
