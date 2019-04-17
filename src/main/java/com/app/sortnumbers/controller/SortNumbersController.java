package com.app.sortnumbers.controller;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.sortnumbers.dto.SortDTO;
import com.app.sortnumbers.service.SortNumbersService;

@RestController
public class SortNumbersController {
	
	@Autowired
	private SortNumbersService sortNumbersService;
	
	@PostMapping("/sortarrays/{inputString}")
	public SortDTO sortNumbers(@PathVariable String inputString) {
		Instant start = Instant.now();
		SortDTO sortDTO = new SortDTO();
		sortDTO.setInputArray(inputString);
		sortDTO = sortNumbersService.sortNumbers(sortDTO);
		Instant end = Instant.now();
		sortDTO.setTimeTaken(Duration.between(start, end).toMillis());
		sortNumbersService.saveNumbers(sortDTO);
		return sortDTO;
	}
	
	@GetMapping("/getresults")
	public List<SortDTO> getResults(){
		return sortNumbersService.getResults();
	}
}
