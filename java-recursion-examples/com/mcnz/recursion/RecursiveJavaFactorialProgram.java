package com.mcnz.recursion;

public class RecursiveJavaFactorialProgram {
	
	public static void main(String args[]) {
		long nFactoriral = factorialProgram(9);
		System.out.println(nFactoriral);
	}
	 
	/* Java factorial program with recursion. */
	public static long factorialProgram(long n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorialProgram(n - 1);
		}
	}
}
