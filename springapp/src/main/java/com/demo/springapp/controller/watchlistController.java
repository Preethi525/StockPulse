package com.demo.springapp.controller;

import com.demo.springapp.model.watchlist;
import com.demo.springapp.service.watchlistService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/watchlist")
public class watchlistController {

    private final watchlistService service;

    public watchlistController(watchlistService service) {
        this.service = service;
    }

    @GetMapping
    public List<watchlist> getAllWatchlists() {
        return service.getAllWatchlists();
    }

    @GetMapping("/{id}")
    public ResponseEntity<watchlist> getWatchlistById(@PathVariable Long id) {
        return service.getWatchlistById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public watchlist createWatchlist(@RequestBody watchlist watchlist1) {
        return service.createWatchlist(watchlist1);
    }

    @PutMapping("/{id}")
    public ResponseEntity<watchlist> updateWatchlist(@PathVariable Long id, @RequestBody watchlist watchlist1) {
        watchlist.setwatchlistId(id);
        return ResponseEntity.ok(service.updateWatchlist(watchlist1));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWatchlist(@PathVariable Long id) {
        service.deleteWatchlist(id);
        return ResponseEntity.noContent().build();
    }
}
