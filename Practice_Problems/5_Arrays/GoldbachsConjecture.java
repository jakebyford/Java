// ************************************************************************************************************
// GoldbachsConjecture.java				Author: Jake Byford								Spring 2021
//
// CS 505852                        	Prog Data Struct & Algo							ID: 31556607
// 
// Implement the Sieve of Eratosthenes and use it to find all prime numbers less than or equal to one million. 
// Use the result to prove Goldbach's Conjecture for all even integers between four and one million, inclusive.
//
// ************************************************************************************************************

import java.math.BigInteger;
import java.util.Scanner;

public class GoldbachsConjecture {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter an integer (4 - 1,000,000): ");
		int n = args.length == 1 ? Integer.parseInt(args[0]) : scnr.nextInt();
		int array[]=new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = i;
		}
		sieve(array);
		System.out.println("After performing Sieve: ");
		display(array);

		int array1[] = new int[n];
		int start = 4;
		for(int i = 0; i < n; i++) {
			array1[i] = start++;
		}
		System.out.println("After goldbach: ");
		System.out.println("Prime numbers from 4 \t two prime numbers that sum it up: ");
		goldbach(array1);
		}
		/*
		The function modifies the array so that only the prime numbers remain;
		all other values are zeroed out.
		*/
		private static void sieve(int[] array) {
			for (int i = 0; i < array.length; i++) {
				if (!IsPrime(array[i]))
					array[i] = 0;
			}
		}
		// to check a number is prime or not
		private static boolean IsPrime(int num) {
			BigInteger val = BigInteger.valueOf(num);
			boolean status = val.isProbablePrime(1);
			return status;
		}

		//displays array elements
		private static void display(int[] array) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]+" ");
			}
			System.out.println(" ");
		}

		//	displays even number from 4 and the two primes make up it
		private static void goldbach(int[] array) {
			for( int i = 0; i < array.length; i++) {
				System.out.println("");	
				if (isEven(array[i])) {
					System.out.print(array[i] + "\t\t");
					sumOfPrime(array, array[i], i);
				}
			}
		}
		//to check a number is even
		//Here repeated subtraction is used
		private static boolean isEven(int number) {
			boolean result = false;
			while (number >= 2) {
				number -= 2;
			}
			if (number == 0)
				result = true;
			return result;
		}

		//to find the two prime numbers that make up a even number
		private static void sumOfPrime(int[] array, int number, int i) {
			for (int j = 0; j < i; j++) {
				for (int k = 0; k < i; k++) {
					if(IsPrime(array[j]) && IsPrime(array[k]) && array[j] + array[k] == number) {
						System.out.print(array[j] + " " + array [k]);
						i = 0;
						break;
					}
				}
			}
		}

	}
