package com.mcnz.recursion;

public class VerySimpleRecursionExample {

	public static void main(String[] args) {
		callMyself(9);
	}
	
	public static void callMyself(long i) {
		/* Stop the Java recursion program when we hit zero */
		if (i < 0) {
			return;
		}
		/* Print the number. 
		 * Then recursively call this Java method again
		 * to print the number minus one.
		 */
		System.out.print(i);
		i = i - 1;
		callMyself(i);
		/* This would be tail recursion in Java */
	}
}
