package com.example.ProjectFinal.Enitity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Tournament")
public class TournamentEntity {

	@Id
	@Column(name="number")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int number;
	
	@Column(name="team")
	public String team;
	
	@Column(name="Tournament")
	public String Tournament;
	
	// One-to-One relationship with FixtureEntity
	@OneToOne(mappedBy = "tournament", cascade = CascadeType.ALL)
	private FixtureEntity fixture;
}
