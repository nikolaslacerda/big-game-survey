package com.dssurvey.server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dssurvey.server.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
