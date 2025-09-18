package com.demo.springapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class watchlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long watchlistId;

    @Version
    private Long version;

    private long userId;
    private long stockId;
    public static void setwatchlistId(Long id) {
       
        throw new UnsupportedOperationException("Unimplemented method 'setwatchlistId'");
    }
}
