package com.assignment;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter n : ");
		int n = sc.nextInt();
		int originalNum = n;
		int temp =0;
		while(n>0) {
			int LastDigit = n%10;
			temp = (temp*10) + LastDigit;
			n= n/10;
		}
		System.out.println("reverse number : " + temp);
		if(originalNum == temp) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}
