package com.demo.springapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
  @Table(name="stock_info")

public class stockinfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long stockId;

    @Version
    private Long version;

    private String stockSymbol;
    private String companyName;
    private double currentPrice;
    private String market;
    private boolean status;
}
