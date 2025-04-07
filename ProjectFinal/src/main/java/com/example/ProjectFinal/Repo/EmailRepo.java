package com.example.ProjectFinal.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjectFinal.Enitity.EmailEntity;

public interface EmailRepo extends JpaRepository<EmailEntity, Integer> {
}