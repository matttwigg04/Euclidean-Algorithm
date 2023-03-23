// Matthew Twigg, Block7, Post AP Data Structures

//Eucldian Algorithm is an algorithm used to find the greatest common divisor of two numbers.

// It works by dividing the two numbers, and then taking the initial divisor and dividing it by the remainder. You repeate the process until you have a remainder of 0. Once you have the 0 remainder the GCD is the last dividend used.

import java.util.*;
public class GCD {
	public static void main(String[] args) {
		// The main function just takes the two numbers as input and then calls the EuclideanGCD function with those 2 numbers as parameters
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your first number (larger): ");
	    int firstNum = sc.nextInt();
	    System.out.println("Enter your second number (smaller): ");
	    int secondNum = sc.nextInt();
	    System.out.println("The GCD is "+ EuclideanGCD(firstNum, secondNum));
	    
	}
	public static int EuclideanGCD(int a, int b) {
		int gcd = b;// This sets the gcd = to the "last dividend"
		int newDividend;
		// if the remainder is 0 then the method will return the gcd 
		if(a%b == 0) {
			return gcd;
		}
		else { // if there is still a remainder the method will take the mod of the two numbers and then call the method again with the dividend now as the divisor and the remainder as the new dividend
			newDividend = a%b;
			return EuclideanGCD(gcd,newDividend);	
		}	
	}
}

//Sources: https://www.youtube.com/watch?v=p5gn2hj51hs&t=292s https://en.wikipedia.org/wiki/Euclidean_algorithm

