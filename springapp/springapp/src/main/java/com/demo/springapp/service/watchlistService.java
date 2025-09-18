package com.demo.springapp.service;

import com.demo.springapp.model.watchlist;
import com.demo.springapp.repository.watchlistRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class watchlistService {

    private final watchlistRepository repo;

    public watchlistService(watchlistRepository repo) {
        this.repo = repo;
    }

    public List<watchlist> getAllWatchlists() {
        return repo.findAll();
    }

    public Optional<watchlist> getWatchlistById(Long id) {
        return repo.findById(id);
    }

    public watchlist createWatchlist(watchlist watchlist1) {
        return repo.save(watchlist1);
    }

    public watchlist updateWatchlist(watchlist watchlist1) {
        return repo.save(watchlist1);
    }

    public void deleteWatchlist(Long id) {
        repo.deleteById(id);
    }
}
