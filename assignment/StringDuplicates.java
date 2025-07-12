package com.assignment;
import java.util.Scanner;

public class StringDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String name = sc.nextLine();
		String output= "";
		System.out.print("after removal : ");
		for(int i =0; i<name.length();i++) {
			boolean IsDuplicate = false;
			for(int j=0;j<i;j++) {
				if(name.charAt(i)==name.charAt(j)) {
					IsDuplicate = true;
					break;
				}
			}
			if(IsDuplicate == false) {
				System.out.print(output + name.charAt(i));
			}
		
		}
		sc.close();

	}

}
