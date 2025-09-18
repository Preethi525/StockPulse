package com.demo.springapp.service;

import com.demo.springapp.model.stockhistory;
import com.demo.springapp.repository.stockhistoryRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class stockhistoryService {

    private final stockhistoryRepository repo;

    public stockhistoryService(stockhistoryRepository repo) {
        this.repo = repo;
    }

    public List<stockhistory> getAllStockHistories() {
        return repo.findAll();
    }

    public Optional<stockhistory> getStockHistoryById(Long id) {
        return repo.findById(id);
    }

    public stockhistory createStockHistory(stockhistory stockHistory1) {
        return repo.save(stockHistory1);
    }

    public stockhistory updateStockHistory(stockhistory stockHistory1) {
        return repo.save(stockHistory1);
    }

    public void deleteStockHistory(Long id) {
        repo.deleteById(id);
    }
}
