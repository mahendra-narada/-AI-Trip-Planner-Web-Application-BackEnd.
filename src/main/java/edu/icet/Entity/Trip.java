package edu.icet.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tripId;
    private int userId;
    private int guideId;
    private String location;
    private LocalDate startDate;
    private LocalDate endDate;
    private int travelers;
    private double budget;
    @Lob
    @Column(columnDefinition = "LONGTEXT ")
    private String tripPlan;
    

}
