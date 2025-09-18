package com.demo.springapp.service;

import com.demo.springapp.model.stockinfo;
import com.demo.springapp.repository.stockinfoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class stockinfoService {

    private final stockinfoRepository repo;

    public stockinfoService(stockinfoRepository repo) {
        this.repo = repo;
    }

    public List<stockinfo> getAllStockInfo() {
        return repo.findAll();
    }

    public Optional<stockinfo> getStockInfoById(Long id) {
        return repo.findById(id);
    }

    public stockinfo createStockInfo(stockinfo stockInfo1) {
        return repo.save(stockInfo1);
    }

    public stockinfo updateStockInfo(stockinfo stockInfo1) {
        return repo.save(stockInfo1);
    }

    public void deleteStockInfo(Long id) {
        repo.deleteById(id);
    }
}
