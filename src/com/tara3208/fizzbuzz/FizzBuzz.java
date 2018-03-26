package com.tara3208.fizzbuzz;

/**
 * FizzBuzz - Developed by Joshua T. Q. (Potters).
 * All rights reserved 2018.
 */
public class FizzBuzz
{

	public static void main(String[] args) {
		int i = 0;

		do
		{
			boolean multipleOfThree = (i % 3 == 0);
			boolean multipleOfFive  = (i % 5 == 0);
			i++;

			if (multipleOfThree && multipleOfFive)
			{
				System.out.println("FizzBuzz (" + (i - 1) + ")");
				continue;
			}

			if (multipleOfThree)
			{
				System.out.println("Fizz (" + (i - 1) + ")");
				continue;
			}

			if (multipleOfFive)
			{
				System.out.println("Buzz (" + (i - 1) + ")");
				continue;
			}

			System.out.println(i);
		} while (i <= 100);
	}
}
