package com.demo.springapp.controller;

import com.demo.springapp.model.stockinfo;
import com.demo.springapp.service.stockinfoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stockinfo")
public class stockinfoController {

    private final stockinfoService service;

    public stockinfoController(stockinfoService service) {
        this.service = service;
    }

    @GetMapping
    public List<stockinfo> getAllStockInfo() {
        return service.getAllStockInfo();
    }

    @GetMapping("/{id}")
    public ResponseEntity<stockinfo> getStockInfoById(@PathVariable Long id) {
        return service.getStockInfoById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public stockinfo createStockInfo(@RequestBody stockinfo stockInfo) {
        return service.createStockInfo(stockInfo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<stockinfo> updateStockInfo(@PathVariable Long id, @RequestBody stockinfo stockInfo) {
        stockInfo.setStockId(id);
        return ResponseEntity.ok(service.updateStockInfo(stockInfo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStockInfo(@PathVariable Long id) {
        service.deleteStockInfo(id);
        return ResponseEntity.noContent().build();
    }
}
