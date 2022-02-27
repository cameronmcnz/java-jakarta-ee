package com.mcnz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RuntimeException07 {

	public static void main(String[] args) {
		Integer[] data = { 1, 2, 3, 5, 8, 13, 21 };
		List<Integer> list = Arrays.asList(data);
		list.add(Integer.valueOf("1010"));

	}
}
