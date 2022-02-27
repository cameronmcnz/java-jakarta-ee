package com.mcnz;

public class RuntimeException05 {

	public static void main(String[] args) {

		String[] data = new String[-5]; // throws Runtime Exception
		data[1] = "More Data";

	}

}
