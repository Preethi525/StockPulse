
package com.demo.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.springapp.model.stockhistory;

@Repository
public interface stockhistoryRepository extends JpaRepository<stockhistory, Long> {
}
