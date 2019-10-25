package com.amdocs.designpatterns;

import java.util.ArrayList;

public class NullAlgorithm implements IAlgorithm {

	@Override
	public void sort(ArrayList<Integer> numbers) {
		System.out.println("Unsupported Algorithm object. Please choose a valid option.");

	}

}
