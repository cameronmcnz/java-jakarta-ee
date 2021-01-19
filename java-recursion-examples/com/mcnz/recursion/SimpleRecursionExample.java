package com.mcnz.recursion;

public class SimpleRecursionExample {

	public static void main(String[] args) {
		long numberOfInterest = 9;
		
		SimpleRecursionExample.callMyself(numberOfInterest);
		System.out.println("\n**********");
		
		long sumOfAllNumbers = SimpleRecursionExample.sumOfAllNumbers(numberOfInterest);
		System.out.println(sumOfAllNumbers);
		
		long nFactoriral = SimpleRecursionExample.factorialProgram(numberOfInterest);
		System.out.println(nFactoriral);
		
		for(long i=1; i<=numberOfInterest; i++){ 
			System.out.print(fibonacci(i) +" "); 
		}
		System.out.println();
		
		boolean flag = SimpleRecursionExample.palindromeCheck("sitonapanotis");
		System.out.println(flag);
		flag = SimpleRecursionExample.palindromeCheck("nine");
		System.out.println(flag);
		flag = SimpleRecursionExample.palindromeCheck("amanaplanacanalpanama");
		System.out.println(flag);

	}

	public static void callMyself(long i) {
		/* Stop the Java recursion program when we hit zero */
		if (i == 0) {
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

	/* A recursive Java example to sum all natural numbers up to a given long. */
	public static long sumOfAllNumbers(long number) {
		/* Stop the recursive Java program at zero */
		if (number != 0) {
			return number + sumOfAllNumbers(number - 1);
		} else {
			return number;
		}
	}

	/* Java factorial program with recursion. */
	public static long factorialProgram(long n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorialProgram(n - 1);
		}
	}

	/* A recursive Fibonnaci sequence in Java program */
	public static long fibonacci(long number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		return fibonacci(number - 1) + fibonacci(number - 2);
	}
	
	/* Recursive Java example to check for palindromes */	
    public static boolean palindromeCheck(String s)
    {   
        if(s.length() == 0 || s.length() == 1) {
            return true; 
        }
        if(s.charAt(0) == s.charAt(s.length()-1)) {
        	return palindromeCheck(s.substring(1, s.length()-1));
        }

        return false;
    }
}
