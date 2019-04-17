package com.app.sortnumbers.service;

import java.util.List;

import com.app.sortnumbers.dto.SortDTO;

public interface SortNumbersService {
	
	SortDTO sortNumbers(SortDTO sortDTO);
	
	void saveNumbers(SortDTO sortDTO);

	List<SortDTO> getResults();
	
}
