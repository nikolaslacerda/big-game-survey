package com.dssurvey.server.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dssurvey.server.dto.RecordDTO;
import com.dssurvey.server.dto.RecordInsertDTO;
import com.dssurvey.server.entities.Game;
import com.dssurvey.server.entities.Record;
import com.dssurvey.server.repositories.GameRepository;
import com.dssurvey.server.repositories.RecordRepository;

@Service
public class RecordService {
	
	@Autowired
	private RecordRepository recordRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO recordInsertDTO) {
		Record record = new Record();
		record.setName(recordInsertDTO.getName());
		record.setAge(recordInsertDTO.getAge());
		record.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(recordInsertDTO.getGameId());
		record.setGame(game);
		
		record = recordRepository.save(record);
		
		return new RecordDTO(record);
	}
	

}
