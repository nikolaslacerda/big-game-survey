package com.dssurvey.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dssurvey.server.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

}
