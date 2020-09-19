package com.dssurvey.server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dssurvey.server.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long>{

}
