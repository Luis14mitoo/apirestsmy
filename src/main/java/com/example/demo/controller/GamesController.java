package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Games;
import com.example.demo.repository.InterfaceGames;





@RestController
@RequestMapping("/Games")
public class GamesController {

	@Autowired
	private InterfaceGames interfaceGames;
	
	@GetMapping
	public List<Games> games(){
		return (List<Games>) interfaceGames.findAll();
	}
	
	@GetMapping("/{id}")
	public Games  games(@PathVariable("id") Integer id){
		return  interfaceGames.findById(id)
				.orElseThrow(() -> new IllegalStateException("Error al traer el elemento"+id));
	}
	
	@PostMapping
	public void insert(@RequestBody Games games) {
		interfaceGames.save(games);
		
	}
	
	@PutMapping
	public void update(@RequestBody Games games) {
		interfaceGames.save(games);
	}
	
	@DeleteMapping(value="/{id}")
	public void delete(@PathVariable("id") Integer id){
		interfaceGames.deleteById(id);
	}
	
}

