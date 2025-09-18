package com.demo.springapp.controller;

import com.demo.springapp.model.stockhistory;
import com.demo.springapp.service.stockhistoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stockhistory")
public class stockhistoryController {

    private final stockhistoryService service;

    public stockhistoryController(stockhistoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<stockhistory> getAllStockHistories() {
        return service.getAllStockHistories();
    }

    @GetMapping("/{id}")
    public ResponseEntity<stockhistory> getStockHistoryById(@PathVariable Long id) {
        return service.getStockHistoryById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public stockhistory createStockHistory(@RequestBody stockhistory stockHistory1) {
        return service.createStockHistory(stockHistory1);
    }

    @PutMapping("/{id}")
    public ResponseEntity<stockhistory> updateStockHistory(@PathVariable Long id, @RequestBody stockhistory stockHistory1) {
        stockhistory.setstockhistoryId(id);
        return ResponseEntity.ok(service.updateStockHistory(stockHistory1));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStockHistory(@PathVariable Long id) {
        service.deleteStockHistory(id);
        return ResponseEntity.noContent().build();
    }
}
