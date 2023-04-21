package com.array_operations;
import java.util.*;
public class lets {

	public static void main(String[] args) {
		
		int []arr = new int[10];
		
		System.out.println("Array Size is "+arr.length);
		System.out.println("Enter the elements of array : ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int size = arr.length/2;
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		
		for(int i=0;i<size;i++) {
			arr1[i]=arr[i];
		}
		
		for(int i=0;i<size;i++) {
			arr2[i]=arr[i+arr1.length];
		}
		System.out.println("arr= "+Arrays.toString(arr));
		System.out.println("arr1= "+Arrays.toString(arr1));
		System.out.println("arr2= "+Arrays.toString(arr2));

	}

}
