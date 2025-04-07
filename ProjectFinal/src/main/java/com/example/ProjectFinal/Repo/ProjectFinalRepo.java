package com.example.ProjectFinal.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ProjectFinal.Enitity.*;

@Repository
public interface ProjectFinalRepo extends JpaRepository<ProjectFinalEntity, Integer>{

	List<ProjectFinalEntity> findAll();

	List<ProjectFinalEntity> findByNameAndScore(String name, int score);
	List<ProjectFinalEntity> findByNameOrScore(String name, int score);
	List<ProjectFinalEntity> findByNameIn(List<String> name);
	List<ProjectFinalEntity> findByNameStartingWith(String name);
	List<ProjectFinalEntity> findByNameEndingWith(String name); 
    List<ProjectFinalEntity>findByNameContains(String name);
	
	List<ProjectFinalEntity>findByNameIsContaining(String name);
	List<ProjectFinalEntity>findByNameNotContains(String name);

}