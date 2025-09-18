package com.demo.springapp.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity

public class alert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long alertId;

    @Version
    private Long version;

    private long userId;
    private long stockId;
    private String condition;    // Example: "price > 100"
    private boolean isActive;
    private LocalDateTime createdAt;
}
