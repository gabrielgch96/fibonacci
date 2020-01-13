package fr.epita.fibonacci.services;

public class Fibonacci {
	
	/*Calculates the nth fibonacci number */
	public int calculateFibonacci(Integer number) throws IllegalArgumentException {
		int next = 0, first=0, second = 1;
		if(number < 0)
			throw new IllegalArgumentException();
		
		if(number ==0)
			return first;

		for(int i = 2; i <= number; i++) {
			next = first +second;
			first = second;
			second = next;	
		}
		return second;
	}

}
