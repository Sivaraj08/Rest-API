package com.example.ProjectFinal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProjectFinal.Enitity.FixtureEntity;
import com.example.ProjectFinal.Repo.FixtureRepo;

@Service
public class FixtureService {
	@Autowired FixtureRepo rep;
	public List<FixtureEntity> getall() {
		return rep.findAll();		
	}
}
