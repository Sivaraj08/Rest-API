package com.example.ProjectFinal.Enitity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Fixture")
public class FixtureEntity {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="team1")
	public String team1;
	
	@Column(name="team2")
	public String team2;
	
	@Column(name="score1")
	public int score1;
	
	@Column(name="score2")
	public int score2;
	
	@Column(name="winner")
	public String winner;
	
	@Column(name="Tournament")
	public String Tournament;

	// One-to-One relationship with TournamentEntity
	@OneToOne
	@JoinColumn(name = "tournament_id", referencedColumnName = "number")
	private TournamentEntity tournament;
}
