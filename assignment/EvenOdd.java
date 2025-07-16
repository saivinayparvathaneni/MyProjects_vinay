package com.assignment;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number to check : ");
		int x = sc.nextInt();
		
		if(x%2==0) {
			System.out.println(x + " is even");
		}else {
			System.out.println(x + " is odd");
		}
		sc.close();
	}

}
