package com.array_operations;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		int num,sum=0,rem,temp;
		System.out.println("Enter any number to check: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		temp = num;
		while(num>0) {
			rem = num%10;
			sum = (sum*10)+rem;
			num = num/10;
		}
		if(temp==sum)
			System.out.println(temp+" is a Palindrome");
		else
			System.out.println(temp+" is not a palindrome");
	}

}
