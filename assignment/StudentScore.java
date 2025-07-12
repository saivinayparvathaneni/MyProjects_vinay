package com.assignment;
import java.util.Scanner;

public class StudentScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student score : ");
		int score = sc.nextInt();
		if(score>=90 && score<=100) {
			System.out.println("Your score is : "+ score);
			System.out.println("Your Grade is : A ");
		}else if(score>=75 && score<=89) {
			System.out.println("Your score is : "+ score);
			System.out.println("Your Grade is : B ");
		}else if (score>=50 && score<=74) {
			System.out.println("Your score is : "+ score);
			System.out.println("Your Grade is : C ");
		}else if (score<50) {
			System.out.println("Your score is : "+ score);
			System.out.println("You have failed the Exam");
		}else {
			System.out.println("Enter a valid score");
		}
	}

}
