package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Games;



@Repository
public interface InterfaceGames extends JpaRepository<Games, Integer>{

}
