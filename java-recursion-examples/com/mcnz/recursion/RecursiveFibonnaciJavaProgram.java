package com.mcnz.recursion;

public class RecursiveFibonnaciJavaProgram {
	
	public static void main (String args[]) {
		for(long i=1; i<=9; i++){ 
			System.out.print(fibonacci(i) +" "); 
		}
		System.out.println();
	}

	
	/* A recursive Fibonnaci sequence in Java program */
	public static long fibonacci(long number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		return fibonacci(number - 1) + fibonacci(number - 2);
	}
}
