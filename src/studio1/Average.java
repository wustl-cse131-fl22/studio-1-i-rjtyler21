package studio1;

import java.util.Scanner;

public class Average {
	
	public static void main(String args[]) {
	
	Scanner number = new Scanner(System.in);
	System.out.println("What is the first integer you want to average?");
	int first = number.nextInt();
	System.out.println("What is the second integer you want to average");
	int second = number.nextInt();
	double average = (first+second)/2.0;
	System.out.println("The average of " + first + " and " + second + " is " + average + ".");
	
	
	}

}
