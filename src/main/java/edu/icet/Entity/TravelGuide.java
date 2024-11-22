package edu.icet.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class TravelGuide {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int guideId;
    private int userId;
    private String fullName;
    private int experience;
    @ElementCollection
    private List<String> languages;
    private String email;
    private String contactNumber;
    private double budget;
    @Lob
    @Column(columnDefinition = "LONGTEXT ")
    private String image;
    @ElementCollection
    private List<String> locations;



}
