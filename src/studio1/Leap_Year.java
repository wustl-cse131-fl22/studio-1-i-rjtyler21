package studio1;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What year do you want to know if it is a leap year?");
		int year = input.nextInt();
		boolean isLeap = (year % 4 == 0) && (year % 100 != 0)||(isLeap = year % 400 == 0);
		System.out.println(year + " is a leap year? " + isLeap);

	}

}
