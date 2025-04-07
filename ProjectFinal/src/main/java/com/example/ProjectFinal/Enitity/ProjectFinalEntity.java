package com.example.ProjectFinal.Enitity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Sports")
public class ProjectFinalEntity {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="team")
    private String team;

    @Column(name="name")
    private String name;

    @Column(name="score")
    private int score;

    @Column(name="Tournament") // Keep column name as "Tournament" (if needed) but change variable name
    private String tournament;
}
