package com.example.ProjectFinal.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ProjectFinal.Enitity.TournamentEntity;

@Repository
public interface TournamentRepo extends JpaRepository<TournamentEntity, Integer>{
		List<TournamentEntity> findAll();
}
