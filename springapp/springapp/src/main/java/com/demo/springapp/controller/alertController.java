package com.demo.springapp.controller;

import com.demo.springapp.model.alert;
import com.demo.springapp.service.alertService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alert")
public class alertController {

    private final alertService service;

    public alertController(alertService service) {
        this.service = service;
    }

    @GetMapping
    public List<alert> getAllAlerts() {
        return service.getAllAlerts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<alert> getAlertById(@PathVariable Long id) {
        return service.getAlertById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public alert createAlert(@RequestBody alert alert1) {
        return service.createAlert(alert1);
    }

    @PutMapping("/{id}")
    public ResponseEntity<alert> updateAlert(@PathVariable Long id, @RequestBody alert alert) {
        alert.setAlertId(id);
        return ResponseEntity.ok(service.updateAlert(alert));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAlert(@PathVariable Long id) {
        service.deleteAlert(id);
        return ResponseEntity.noContent().build();
    }
}
