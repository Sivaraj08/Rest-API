package com.example.ProjectFinal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.ProjectFinal.Enitity.*;
import com.example.ProjectFinal.Service.*;

@RestController
public class ProjectFinalController {
	@Autowired
    private ProjectFinalService service;

    @GetMapping("/get")
    public List<ProjectFinalEntity> getAll() {
        return service.getall();
    }

    @GetMapping("/end/{name}")
    public String point(@PathVariable String name) {
        return "Hello " + name;
    }

    @PostMapping("/postt")
    public ProjectFinalEntity postAll(@RequestBody ProjectFinalEntity obj) {
        return service.post(obj);
    }

	@DeleteMapping("/deletee/{id}")
	public String delete(@PathVariable int id) {
        return service.deleteId(id);
    }
	
	@PutMapping("/updatee/{id}")
	public ProjectFinalEntity updatebyid(@PathVariable int id, @RequestBody ProjectFinalEntity end) {
	    return service.updateid(id, end);
	}

	@GetMapping("/And")
    public List<ProjectFinalEntity> Sorting(@RequestParam String name,@RequestParam int score)
    {
    	return service.retrive_specific(name, score);
    }
	@GetMapping("/Or")
    public List<ProjectFinalEntity> Sortingg(@RequestParam String name,@RequestParam int score)
    {
    	return service.retrive_specificc(name, score);
    }
	@GetMapping("/in")
	public List<ProjectFinalEntity> SortingIn(@RequestParam List<String> name) {
		return service.fetchOne(name);
	}
	@GetMapping("/Starting")
	public List<ProjectFinalEntity> Sortingstart(@RequestParam String name){
		return service.start(name);
	}
	@GetMapping("/Ending")
	public List<ProjectFinalEntity> Sortingend(@RequestParam String name){
		return service.end(name);
	}
	@GetMapping("/contains")
	public List<ProjectFinalEntity> namecontains(@RequestParam String name) {
		return service.namecontain(name);
	}
	
	@GetMapping("/iscontains")
	public List<ProjectFinalEntity> iscontains(@RequestParam String name) {
		return service.iscontain(name);
	}
	
	@GetMapping("/notcontains")
	public List<ProjectFinalEntity> notcontains(@RequestParam String name) {
		return service.notcontains(name);
	}
}
