package org.example.cours.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date dateEdition;
    private boolean enStock;
    private int nbrExamplaire;
}
