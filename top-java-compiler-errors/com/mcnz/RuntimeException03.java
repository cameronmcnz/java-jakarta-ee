package com.mcnz;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RuntimeException03 {

	public static void main(String[] args) {
		
		
		LocalDate now = LocalDate.now();
		DateTimeFormatter.RFC_1123_DATE_TIME.format(now);
		
		Number[] bigInt = new BigInteger[5];
		bigInt[0] = Double.valueOf(12345);
		
		
		
	
	}

}
