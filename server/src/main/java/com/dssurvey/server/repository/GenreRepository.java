package com.dssurvey.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dssurvey.server.model.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{

}
