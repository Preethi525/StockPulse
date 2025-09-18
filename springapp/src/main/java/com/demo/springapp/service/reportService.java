package com.demo.springapp.service;

import com.demo.springapp.model.report;
import com.demo.springapp.repository.reportRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class reportService {

    private final reportRepository repo;

    public reportService(reportRepository repo) {
        this.repo = repo;
    }

    public List<report> getAllReports() {
        return repo.findAll();
    }

    public Optional<report> getReportById(Long id) {
        return repo.findById(id);
    }

    public report createReport(report report1) {
        return repo.save(report1);
    }

    public report updateReport(report report1) {
        return repo.save(report1);
    }

    public void deleteReport(Long id) {
        repo.deleteById(id);
    }
}
