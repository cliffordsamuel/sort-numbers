package com.app.sortnumbers.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.sortnumbers.dto.SortDTO;
import com.app.sortnumbers.entity.SortEntity;
import com.app.sortnumbers.repository.SortNumbersRepository;
import com.app.sortnumbers.service.SortAlgorithm;
import com.app.sortnumbers.service.SortNumbersService;

@Service
public class SortNumbersServiceImpl implements SortNumbersService {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	@Autowired
	private SortNumbersRepository sortNumbersRepository;

	@Override
	public SortDTO sortNumbers(SortDTO sortDTO) {
		try {
			String [] stringArray = sortDTO.getInputArray().split(",");
			int [] intArray = new int[stringArray.length];
			for(int i=0; i<stringArray.length; i++) {
				intArray[i] = Integer.parseInt(stringArray[i]);
			}
			int [] sortedIntArray = sortAlgorithm.sort(intArray);
			String sortedStrArray = Arrays.toString(sortedIntArray);
			sortDTO.setOutputArray(sortedStrArray);
		} catch (NumberFormatException e) {
			sortDTO.setResponseCode(1);
			sortDTO.setResponseMessage("Please enter numeric values in the Input Box");
		}
		return sortDTO;
	}

	@Override
	public void saveNumbers(SortDTO sortDTO) {
		SortEntity sortEntity = new SortEntity();
		sortEntity.setId(Math.random());
		sortEntity.setInputArray(sortDTO.getInputArray());
		sortEntity.setOutputArray(sortDTO.getOutputArray());
		sortEntity.setTimeTaken(sortDTO.getTimeTaken());
		sortNumbersRepository.save(sortEntity);
	}

	@Override
	public List<SortDTO> getResults() {
		List<SortDTO> sortDTOList = new ArrayList<SortDTO>();
		List<SortEntity> sortEntityList = new ArrayList<SortEntity>();
		sortEntityList = (List<SortEntity>) sortNumbersRepository.findAll();
		for (SortEntity sortEntity : sortEntityList) {
			SortDTO sortDTO = new SortDTO();
			sortDTO.setInputArray(sortEntity.getInputArray());
			sortDTO.setOutputArray(sortEntity.getOutputArray());
			sortDTO.setTimeTaken(sortEntity.getTimeTaken());
			sortDTOList.add(sortDTO);
		}
		return sortDTOList;
	}

}
