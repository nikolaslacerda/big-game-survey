package com.dssurvey.server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dssurvey.server.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

}
