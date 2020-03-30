// Question 6

import java.util.Scanner;


public class Q6{
	public static void main(String[] args){
		//your code here
		double[] anArray;
		anArray = new double[10];
		int i = 0;
		while (i < 10) {
			System.out.print("Please enter the grade in percentage of student " + (i+1) + ": ");
			Scanner scanGrade = new Scanner(System.in);
 			double value = scanGrade.nextDouble();
 			anArray[i] = value;
 			i++;
 		}

		System.out.println("The average grade for the students is: " + calculateAverage(anArray) + "%." );
		System.out.println("The median grade for the students is: " + calculateMedian(anArray) + "%.");
		System.out.println("There is " + calculateNumberFailed(anArray) + " students that failed.");
		System.out.println("There is " + calculateNumberPassed(anArray) + " students that passed.");
	}


	// I added this function to be able to sort the list for the median
	public static void sort(double[] xs){
		int i, j, argMin;
		double tmp;
		for (i = 0; i < xs.length - 1; i++) {
			argMin = i;
			for (j = i + 1; j < xs.length; j++) {
				if (xs[j] < xs[argMin]) {
					argMin = j;
				}
			}
			tmp = xs[argMin];
			xs[argMin] = xs[i];
			xs[i] = tmp;
		}
	}

	public static double calculateAverage(double[] notes){
		//your code here
		double result;
		double sum = 0.0;

		for(int i = 0; i < notes.length; i++){
			sum = sum + notes[i];
		}

		result = sum / notes.length;

		return result;
	}

	public static double calculateMedian(double[] notes){
		//your code here
		sort(notes);
		if(notes.length % 2 == 0){
			return (notes[(notes.length - 1) / 2] + notes[(notes.length / 2)]) / 2 ;
		} else{
			return notes[(notes.length / 2)];
		}

	}

	public static int calculateNumberFailed(double[] notes){
		//your code here
		int count = 0;
		for(int i = 0; i < notes.length; i++){
			if(notes[i] < 50){
				count = count + 1;
			}
		}
		return count;
	}

	public static int calculateNumberPassed(double[] notes){
		//your code here
		int count = 0;
		for(int i = 0; i < notes.length; i++){
			if(notes[i] >= 50){
				count = count + 1;
			}
		}
		return count;
	}
}