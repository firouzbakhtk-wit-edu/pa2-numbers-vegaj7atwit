package edu.wit.cs.comp1000;

import java.util.Scanner;
// TODO: document this class
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		double a, b, c, d, ORoot;
	
	
		System.out.printf("Enter a b c: ");
		
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		d = (b*b) - 4*a*c;
//		System.out.printf("the answer is: %f%n", d);
		
		
		ORoot = -b / (2*a);
		
		if  (d < 0) {
			System.out.printf("Roots: imaginary%n");
		}
		else if (d == 0) {
			System.out.printf("Root: %.2f%n", ORoot);
		}
		else {
			
			double root1 = (-b + Math.sqrt(d)) / (2 * a);
			double root2 =  (-b - Math.sqrt(d)) / (2 * a);
			 
			
		
			if (root1 > root2) {
				double temp = root1;
				root1 = root2;
						root2 = temp;
					
		}
			System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
		}
	
		input.close();
	
	}
	

}
