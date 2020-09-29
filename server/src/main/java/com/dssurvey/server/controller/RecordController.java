package com.dssurvey.server.controller;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dssurvey.server.dto.RecordDTO;
import com.dssurvey.server.dto.RecordInsertDTO;
import com.dssurvey.server.service.RecordService;

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
	
	@GetMapping
	public ResponseEntity<Page<RecordDTO>> findAll(@RequestParam(value = "page", defaultValue = "0") Integer page,
												   @RequestParam(value = "linesPerPage", defaultValue = "0") Integer linesPerPage,
												   @RequestParam(value = "orderBy", defaultValue = "moment") String orderBy,
												   @RequestParam(value = "direction", defaultValue = "DESC") String direction,
												   @RequestParam(value = "min", defaultValue = "") String min,
												   @RequestParam(value = "max", defaultValue = "") String max
												   ) {
		
		Instant minData = ("".equals(min)) ? null :Instant.parse(min);
		Instant maxData = ("".equals(max)) ? null :Instant.parse(max);
		
		if ( linesPerPage == 0 ) {
			linesPerPage = Integer.MAX_VALUE;
		}
		
		System.out.println(minData + "   " + maxData);
		
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		
		Page<RecordDTO> list = recordService.findByMoments(minData, maxData, pageRequest);
		return ResponseEntity.status(HttpStatus.OK).body(list);
		
	}
	
	
}