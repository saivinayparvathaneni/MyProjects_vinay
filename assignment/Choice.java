package com.assignment;
import java.util.Scanner;

public class Choice {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean condition = true;
		while(condition) {
			statement();
			int x = sc.nextInt();
			switch(x) {
			case 1 : 
				AdditionOperation();
				break;
			case 2 : 
				SubtractionOperation();
				break;
			case 3 : 
				EvenOdd();
				break;
			case 4 :
				PrimeNum();
				break;
			case 5 :
				System.out.println("Exiting...");
				System.out.println("you have exited");
				condition = false;
				break;
			default : 
				if(x!=1 || x!=2 || x!=3 || x!=4 || x!=5 ) {
					System.out.println("please either select the operation between 1 to 4 or to exit enter 5 ");
				}
			}
		}
			
		}
	static void statement() {
		System.out.println("1-Add  2-Subtraction  3-Even/Odd   4-Prime  5-Exit");
		System.out.print("please select an operation to perform : ");
	}
	
	static void AdditionOperation() {
		while(true) {
		System.out.print("enter the value of a : ");
		int a = sc.nextInt();
		System.out.print("enter the value of b : ");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println(c);
		System.out.println("If you want to continue please select operations from below : 1-continue this operation 2-exit this operation");
		int choice = sc.nextInt();
		
		while(true) {
			if(choice ==1) {
				break;
			}else if(choice==2) {
				System.out.println("your exiting this operation");	
				return;
			}
			else  {
				System.out.println("please select between 1 and 2");	
			}
			
		}
		}
	}
		
		
	static void SubtractionOperation() {
		while(true) {
		System.out.print("enter the value of a : ");
		int a = sc.nextInt();
		System.out.print("enter the value of b : ");
		int b = sc.nextInt();
		int c = a-b;
		System.out.print("subtraction of numbers : ");
		System.out.println(c);
		System.out.println("If you want to continue please select operations from below : 1-continue this operation 2-exit this operation");
		int choice = sc.nextInt();
		while(true) {
		if(choice ==1) {
			break;
		}else if(choice ==2) {
			System.out.println("your exiting this operation");
			return;
		}
		else if(choice!=1 || choice!=2) {
			System.out.println("please select between 1 and 2");	
		}
		}
		}
		
	}
	static void EvenOdd() {
		while(true) {
		System.out.print("Enter the number to check Even/Odd : ");
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println("the number " + n + " is Even");
		}else {
			System.out.println("the number " + n + " is Odd");
		}
		System.out.println("If you want to continue please select operations from below : 1-continue this operation 2-exit this operation");
		int choice = sc.nextInt();
		while(true) {
		if(choice ==1) {
			break;
		}else if(choice ==2) {
			System.out.println("your exiting this operation");
			return;
		}
		else if(choice!=1 || choice!=2) {
			System.out.println("please select between 1 and 2");	
		}
		}
		}
	}
	static void PrimeNum() {
		while(true) {
		System.out.print("enter the number to check it as prime or not : ");
		int n = sc.nextInt();
		
		if(n==2) {
			System.out.println(n + " is Prime");
		}else if(n==1) {
			System.out.println(n + " is not Prime");
		}
		else {
			boolean isPrime =true;
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					isPrime=false;
				}
			}
			if(isPrime==true) {
				System.out.println(n + " is prime");
			}else {
				System.out.println(n + " is not Prime");
			}
		}
		
		
		
		
		System.out.println("If you want to continue please select operations from below : 1-continue this operation 2-exit this operation");
		int choice = sc.nextInt();
		while(true) {
		if(choice ==1) {
			break;
		}else if(choice ==2) {
			System.out.println("your exiting this operation");	
			return;
		}
		else if(choice!=1 || choice!=2) {
			System.out.println("please select between 1 and 2");	
		}
		}
		
	}
	
	}
}
			
			
		


