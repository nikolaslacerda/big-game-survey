package com.dssurvey.server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dssurvey.server.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
