package com.example.ProjectFinal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ProjectFinal.Repo.*;
import com.example.ProjectFinal.Enitity.*;

@Service
public class ProjectFinalService {
	@Autowired ProjectFinalRepo rep;
	public List<ProjectFinalEntity> getall() {
		return rep.findAll();		
	}

	public String deleteId(int id) {
		if(rep.existsById(id)) {
			rep.deleteById(id);
			return "Value Deleted Sucessfully";
		}
		else {
			return "value not found "+id;
		}
	}

	public ProjectFinalEntity updateid(int id, ProjectFinalEntity etd) {
	    if (rep.existsById(id)) {
	        ProjectFinalEntity obj = rep.findById(id).get();
	        obj.setId(id);  // Ensure ID is set correctly
	        obj.setTournament(etd.getTournament()); // Now matches JSON key
	        obj.setTeam(etd.getTeam());
	        obj.setName(etd.getName());
	        obj.setScore(etd.getScore());
	        return rep.save(obj);
	    }
	    return null;  // Return null if ID not found
	}

	public ProjectFinalEntity post(ProjectFinalEntity user) {
		return rep.save(user);
	}
	
	public List<ProjectFinalEntity> retrive_specific(String name,int score) {
		return rep.findByNameAndScore(name,score);
	}
	public List<ProjectFinalEntity> retrive_specificc(String name,int score) {
		return rep.findByNameOrScore(name,score);
	}
	public List<ProjectFinalEntity> fetchOne(List<String> name)
	{
		return rep.findByNameIn(name);
	}

	public List<ProjectFinalEntity> start(String name) {
		return rep.findByNameStartingWith(name);
	}
	public List<ProjectFinalEntity> end(String name) {
		return rep.findByNameEndingWith(name);
	}
	 
	public List<ProjectFinalEntity> namecontain(String name) {
		return rep.findByNameContains(name);
	}

	public List<ProjectFinalEntity> iscontain(String name) {
		return rep.findByNameIsContaining(name);
	}
	public List<ProjectFinalEntity> notcontains(String name) {
		return rep.findByNameIsContaining(name);
	}

		
}
