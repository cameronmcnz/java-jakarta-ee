package com.mcnz.myjava.examples;

public class StaticFinalExample {

	public static void main(String[] args) {
		{
			Account first = new Account(123);
			Account second = new Account(456);
			// The following prints 123
			System.out.println(first.accountId);
			// The following prints 456
			System.out.println(second.accountId);
			// Next line triggers a compile error
			// first.accountId = 789;
		}

		{

			Account first = new Account(123);
			Account second = new Account(456);
			second.interestRate = 3.5;
			// Both lines print out 3.5
			System.out.println(first.interestRate);
			System.out.println(second.interestRate);
		}

		{
			Account first = new Account(123);
			Account second = new Account(456);
			// Both lines print out 1000
			System.out.println(first.odLimit);
			System.out.println(second.odLimit);
			// Next line triggers a compile error
			// first.odLimit = 500;
		}
	}

}

class Account {
	public Account(int id) {
		accountId = id;
	}

	final int accountId;
	static double interestRate = 1.5;
	static final int odLimit = 1000;
}
