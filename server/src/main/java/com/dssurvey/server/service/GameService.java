package com.dssurvey.server.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dssurvey.server.dto.GameDTO;
import com.dssurvey.server.entities.Game;
import com.dssurvey.server.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	public List<GameDTO> findAll() {
		List<Game> games = repository.findAll();
		return games.stream().map(x -> new GameDTO(x)).collect(Collectors.toList());
	}

}
