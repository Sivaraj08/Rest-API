package com.example.ProjectFinal.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ProjectFinal.Enitity.*;

@Repository
public interface FixtureRepo extends JpaRepository<FixtureEntity, Integer>{

	List<FixtureEntity> findAll();
}