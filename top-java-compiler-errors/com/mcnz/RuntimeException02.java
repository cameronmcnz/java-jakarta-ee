package com.mcnz;
import java.sql.Timestamp;
import java.util.Date;

public class RuntimeException02 {

	public static void main(String[] args) {
		
		Date today = new Date();
		Timestamp time = (Timestamp)today;
		
		System.out.println(time);

	}

}
