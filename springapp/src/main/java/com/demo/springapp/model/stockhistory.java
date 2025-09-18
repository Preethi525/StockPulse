package com.demo.springapp.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity

public class stockhistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long historyId;

    @Version
    private Long version;

    private long stockId;
    private double price;
    private LocalDateTime timestamp;
    public static void setstockhistoryId(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setstockhistoryId'");
    }
}


