package com.apds.ass3;

import java.util.Scanner;

public class FindingMaxRec {
	
public static int toFindMaxRec(int a[]) {
return toFindMax(a, a.length);
}

public static int toFindMax(int a[], int n) {
	if( n == 1) {
		return a[0];
		
	}
	return Math.max(a[n-1], toFindMax(a, n-1));
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the size of the array : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the number " + ++count + " :");
			a[i] = sc.nextInt();
		}
 		System.out.println(" The  max number is : " + toFindMaxRec(a));
	}

}
