package com.example.ProjectFinal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProjectFinal.Enitity.TournamentEntity;
import com.example.ProjectFinal.Service.TournamentService;

@RestController
public class TournamentController {
	@Autowired
    private TournamentService service;

    @GetMapping("/fetch")
    public List<TournamentEntity> getAll() {
        return service.getall();
    }

    @GetMapping("/endpoint/{name}")
    public String point(@PathVariable String name) {
        return "Hello " + name;
    }

    @PostMapping("/post")
    public TournamentEntity postAll(@RequestBody TournamentEntity obj) {
        return service.post(obj);
    }

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
        return service.deleteId(id);
    }
	
	@PutMapping("/update/{score}")
	public TournamentEntity updatebyid(@PathVariable int score,@RequestBody TournamentEntity end) {
		return service.updateid(score,end);
	}

}
