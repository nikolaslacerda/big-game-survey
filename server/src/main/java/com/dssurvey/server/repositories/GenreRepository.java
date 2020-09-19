package com.dssurvey.server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dssurvey.server.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{

}
