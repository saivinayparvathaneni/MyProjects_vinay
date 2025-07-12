package com.assignment;
import java.util.Scanner;

public class NotRepeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String name = sc.nextLine();
		System.out.print("Non Repeating first character : ");
		for(int i = 0; i<name.length();i++) {
			int count= 0;
			for(int j=0;j<name.length();j++) {
				if(name.charAt(i)==name.charAt(j)) {
					count++;
				}
			}
			if(count==1){
				System.out.print(name.charAt(i));
				break;
			}
		}
		sc.close();

	}

}
