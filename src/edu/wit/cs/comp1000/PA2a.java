package edu.wit.cs.comp1000;

import java.util.Scanner;
// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		//TODO: write your code here
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter five whole numbers: ");
		int a, b, c, d, e; 
		int Pos1, Pos2, Pos3, Pos4, Pos5;
		int Neg1, Neg2, Neg3, Neg4, Neg5;
		int countpos, countneg, count;
		double possum, negsum, totsum;
		double posavg, negavg, totavg;
		count = 5;
		
	
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();
		e = input.nextInt();
		countpos = 0;
		countneg = 0 ;
		
		if (a > 0) {
			Pos1 = a;
			Neg1 = 0;
			countpos++;
		}
		else {
			Neg1 = a;
			Pos1 = 0;
			countneg++;
		}
		if (b > 0) {
			Pos2 = b;
			Neg2 = 0;
			countpos++;
		}
		else {
			Neg2 = b;
			Pos2 = 0;
			countneg++;
		}
		if (c > 0) {
			Pos3 = c;
			Neg3 = 0;
			countpos++;
		}
		else {
			Neg3 = c;
			Pos3 = 0;
			countneg++;
		}
		
		if (d > 0) {
			Pos4 = d;
			Neg4 = 0;
			countpos++;
		}
		else {
			Neg4 = d;
			Pos4 = 0;
			countneg++;
		}
		if (e > 0) {
			Pos5 = e;
			Neg5 = 0;
			countpos++;
		}
		else {
			Neg5 = e;
			Pos5 = 0;
			countneg++;
		}
		possum = Pos1 + Pos2 + Pos3 + Pos4 + Pos5;
		if (countpos > 0) {
		
			posavg =(double)  (possum / countpos);
		}
		else {
			posavg = 0.00;
		}
		negsum = Neg1 + Neg2 + Neg3 + Neg4 + Neg5;
		if (countneg > 0) {
			
			negavg = (double) (negsum / countneg);
		}
		else {
			negavg = 0.00;
		}
		if (countpos == 1){
			System.out.printf("The sum of the %d positive number: %.0f%n", countpos, possum);
		}
		else {
			System.out.printf("The sum of the %d positive numbers: %.0f%n", countpos, possum);
		}
		if (countneg == 1) {
			System.out.printf("The sum of the %d non-positive number: %.0f%n",countneg, negsum);
		}
		else {
			System.out.printf("The sum of the %d non-positive numbers: %.0f%n",countneg, negsum);
		}
		
		totsum = a + b + c + d + e;
		System.out.printf("The sum of the 5 numbers: %.0f%n", totsum);
		
	
		if (countpos == 1){
		System.out.printf("The average of the %d positive number: %.2f%n", countpos, posavg);
	}
		else {
			System.out.printf("The average of the %d positive numbers: %.2f%n", countpos, posavg);
		}
		if (countneg == 1) {
			System.out.printf("The average of the %d non-positive number: %.2f%n", countneg, negavg);
		}
		else {
			System.out.printf("The average of the %d non-positive numbers: %.2f%n", countneg, negavg);
		}
		
		
		totavg = totsum / count;
		System.out.printf("The average of the 5 numbers: %.2f%n", totavg);
		
		
		
		
		
		
		input.close();
	}
	
		
		
}
		


	
	
	