package com.demo.springapp.service;

import com.demo.springapp.model.alert;
import com.demo.springapp.repository.alertRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class alertService {

    private final alertRepository repo;

    public alertService(alertRepository repo) {
        this.repo = repo;
    }

    public List<alert> getAllAlerts() {
        return repo.findAll();
    }

    public Optional<alert> getAlertById(Long id) {
        return repo.findById(id);
    }

    public alert createAlert(alert alert1) {
        return repo.save(alert1);
    }

    public alert updateAlert(alert alert1) {
        return repo.save(alert1);
    }

    public void deleteAlert(Long id) {
        repo.deleteById(id);
    }
}
