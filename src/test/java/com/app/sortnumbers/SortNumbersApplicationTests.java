package com.app.sortnumbers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.sortnumbers.controller.SortNumbersController;
import com.app.sortnumbers.dto.SortDTO;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SortNumbersApplicationTests {

	@Autowired
	SortNumbersController sortNumber;
	
	@Test
	public void sortNumbersHappyFlow() {
		SortDTO sortDTO = new SortDTO();
		String inputArray = "2,3,8,6,5";
		sortDTO = sortNumber.sortNumbers(inputArray);
		assertEquals(0, sortDTO.getResponseCode());
	}
	
	@Test
	public void sortNumbersStringInputTest() {
		SortDTO sortDTO = new SortDTO();
		String inputArray = "2,3,str,6,5";
		sortDTO = sortNumber.sortNumbers(inputArray);
		assertEquals(1, sortDTO.getResponseCode());
	}
	
	@Test
	public void sortNumbersTimeTakenNotNull() {
		SortDTO sortDTO = new SortDTO();
		String inputArray = "2,3,9,6,5";
		sortDTO = sortNumber.sortNumbers(inputArray);
		assertNotNull(sortDTO.getTimeTaken());
	}
	
	@Test
	public void sortNumbersTestOutputArrayNotNull() {
		SortDTO sortDTO = new SortDTO();
		String inputArray = "2,3,9,6,5,12,78,54";
		sortDTO = sortNumber.sortNumbers(inputArray);
		assertNotNull(sortDTO.getOutputArray());
	}
	
	@Test
	public void sortNumbersSpecialCharactersInput() {
		SortDTO sortDTO = new SortDTO();
		String inputArray = "2,3,9,6,5,12,78,54&8*";
		sortDTO = sortNumber.sortNumbers(inputArray);
		assertEquals(1, sortDTO.getResponseCode());
	}
	
	@Test
	public void getResultsTest() {
		String inputArray = "2,3,9,6,5,12,78,54";
		sortNumber.sortNumbers(inputArray);
		assertNotNull(sortNumber.getResults());
	}
	
	@Test
	public void getResultsListNotEmptyTest() {
		String inputArray = "2,3,9,6,5,12,78,54";
		sortNumber.sortNumbers(inputArray);
		assertTrue(sortNumber.getResults().size() != 0);
	}

}
