package com.app.sortnumbers.service.impl;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.app.sortnumbers.service.SortAlgorithm;

@Component
public class ArraysSortInternalAlgorithm implements SortAlgorithm{

	@Override
	public int[] sort(int[] numbers) {
		Arrays.sort(numbers);
		return numbers;
	}
}
