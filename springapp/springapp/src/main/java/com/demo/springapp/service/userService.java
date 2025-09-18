package com.demo.springapp.service;
import com.demo.springapp.model.user;
import com.demo.springapp.repository.userRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class userService {
    
    private final userRepository repo;

    public userService(userRepository repo) {
        this.repo = repo;
    }

    public List<user> getAllCustomers() {
        return repo.findAll();
    }

    public Optional<user> getCustomerById(Long id) {
        return repo.findById(id);
    }

    public user createCustomer(user user1) {
        return repo.save(user1);
    }

    public user updateCustomer(user user1) {
        return repo.save(user1);
    }

    public void deleteCustomer(Long id) {
        repo.deleteById(id);
    
}  
}
