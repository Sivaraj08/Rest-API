package com.example.ProjectFinal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProjectFinal.Enitity.TournamentEntity;
import com.example.ProjectFinal.Repo.TournamentRepo;

@Service
public class TournamentService {
	@Autowired TournamentRepo rep;
	public List<TournamentEntity> getall() {
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

	public TournamentEntity updateid(int id,TournamentEntity etd) {
		if(rep.existsById(id)) {
			TournamentEntity obj=rep.findById(id).get();
			return rep.save(obj);
		}
		return etd;
	}

	public TournamentEntity post(TournamentEntity user) {
		return rep.save(user);
	}

}
