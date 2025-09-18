package com.demo.springapp.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity

public class report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reportId;

    @Version
    private Long version;

    private long userId;
    private String reportType;    // Example: "Stock Performance"
    private String reportContent; // Stored as JSON or plain text
    private LocalDateTime generatedAt;
    public static void setreportId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setreportId'");
    }
}
