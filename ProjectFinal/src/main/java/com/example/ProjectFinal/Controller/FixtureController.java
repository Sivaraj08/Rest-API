package com.example.ProjectFinal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProjectFinal.Enitity.FixtureEntity;
import com.example.ProjectFinal.Service.FixtureService;

@RestController
public class FixtureController {
	@Autowired
    private FixtureService service;

    @GetMapping("/gettt")
    public List<FixtureEntity> getAll() {
        return service.getall();
    }
    
}
