package com.demo.springapp.controller;
import com.demo.springapp.model.user;
import com.demo.springapp.service.userService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class userController {
    private final userService service;

    public userController(userService  service) {
        this.service = service;
    }

    @GetMapping
    public List<user> getAllCustomers() {
        return service.getAllCustomers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<user> getCustomerById(@PathVariable Long id) {
        return service.getCustomerById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public user createCustomer(@RequestBody user customer) {
        return service.createCustomer(customer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<user> updateCustomer(@PathVariable Long id, @RequestBody user customer) {
        customer.setUserId(id);
        return ResponseEntity.ok(service.updateCustomer(customer));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable Long id) {
        service.deleteCustomer(id);
        return ResponseEntity.noContent().build();
    }
}