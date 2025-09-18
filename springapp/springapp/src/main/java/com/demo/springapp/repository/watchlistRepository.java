package com.demo.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.springapp.model.watchlist;

@Repository
public interface watchlistRepository extends JpaRepository<watchlist, Long> {
}
