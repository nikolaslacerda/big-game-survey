package com.dssurvey.server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dssurvey.server.dto.RecordDTO;
import com.dssurvey.server.dto.RecordInsertDTO;
import com.dssurvey.server.services.RecordService;

@RestController
@RequestMapping(value = "/records")
public class RecordController {
	
	@Autowired
	private RecordService recordService;

	@PostMapping
	public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO recordInsertDTO) {
		RecordDTO newDTO = recordService.insert(recordInsertDTO);
		return ResponseEntity.status(HttpStatus.OK).body(newDTO);
		
	}
}