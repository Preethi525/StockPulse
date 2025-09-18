package com.demo.springapp.controller;

import com.demo.springapp.model.report;
import com.demo.springapp.service.reportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/report")
public class reportController {

    private final reportService service;

    public reportController(reportService service) {
        this.service = service;
    }

    @GetMapping
    public List<report> getAllReports() {
        return service.getAllReports();
    }

    @GetMapping("/{id}")
    public ResponseEntity<report> getReportById(@PathVariable Long id) {
        return service.getReportById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public report createReport(@RequestBody report report1) {
        return service.createReport(report1);
    }

    @PutMapping("/{id}")
    public ResponseEntity<report> updateReport(@PathVariable Long id, @RequestBody report report1) {
        report.setreportId(id);
        return ResponseEntity.ok(service.updateReport(report1));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReport(@PathVariable Long id) {
        service.deleteReport(id);
        return ResponseEntity.noContent().build();
    }
}
