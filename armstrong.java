package com.array_operations;
import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
		int num,temp,sum=0,rem;
		System.out.println("Enter any number to check: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		temp = num;
		while(num>0) {
			rem = num%10;
			sum = (rem*rem*rem)+sum;
			num = num/10;
		}
		if(temp==sum) {
			System.out.println(sum+" is a armstrong number");
		}
		else
			System.out.println(sum+" is not a armstrong number");
	}

}
