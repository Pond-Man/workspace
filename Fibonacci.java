//this program is going to serve as a practice program for small problems

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		//Problem 1: Print out all values of the Fibonacci Sequence up to 30,000
		
		/*int[] intArray = {0, 1};
		int newValue;
		
		System.out.println(1);
		
		do {
			
			newValue = intArray[0] + intArray[1];
			System.out.println(newValue);
			intArray[0] = intArray[1];
			intArray[1] = newValue;
			
		} while (newValue <= 30000);*/
		
		
		/*for(int i = 1; i <= 100/7; i++) {
			System.out.println(7*i);
			
		}*/
		
		
		
		//Problem 2: Print out every multiple of 7 up to 700 and separate each line into groups of 7 
		
		/*for (int i = 1; i <= 100; i++) {
		    System.out.print(i * 7 + " ");
		    
		    if (i % 7 == 0) {
		    //when this will be 0 everytime i hits a multiple of 7.
		    //thus creating a new line every 7 digits 
		       System.out.println();
		    }
		}*/
		
		
		
		//Problem 3: Fill an array with all the numbers up to 100 and find their sum over 100
		
		/*int intArray[] = new int[100];
		int sum = 0;
		
		for (int i = 0; i <= 99; i++) {
			
			int num = 100 / (i + 1);
			intArray[i] = num;
			sum = sum + intArray[i];
			
		}
		
		System.out.println(sum);*/
		
		
		
		//Problem 4: Take a number of students, take the grade for each student, calculate an average grade
		//and tell the user the average and how many students have gotten a better grade than the average
		
		/*System.out.print("How many students? ");
		
		int size = kb.nextInt();
		int[] scores;
		scores = new int[size];
		
		int total = 0;
		
		for (int i = 0; i < size; i++) {
			System.out.print("Please enter mark number " + (i + 1) + ": ");
			scores[i] = kb.nextInt();
			total = scores[i] + total; 
					
		}
		
		double average = (double) total / size;
		System.out.println("The average is: " + average);
		int n = 0; 
		
		for (int i = 0; i < size; i++) {
			if(scores[i] > average) {
				n++;
			}
		}
		System.out.println(n + " student(s) have a mark higher than the average.");*/
		
		
		
		//Problem 5: Take the ages of 30 children (age 0-10), find out how many of them are aged 0/1/2/3/4/5/6/7/8/9/10
		
		int[] count = new int[11];
		
		for(int i = 0; i < 30; i++) {
			
			
			
		}
		
		
		
	}
}
		
		
		
	


