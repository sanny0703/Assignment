package assignment;

import java.util.Scanner;

public class Fibonacci {

	public static int fib(int n) {
		
		if(n <=2) return 1;
		return fib(n-1)+fib(n-2);
		
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Ur number: ");
		n = sc.nextInt();
		for(int i=1;i<n+1;i++) {
			System.out.print(fib(i)+" ");
		}
		sc.close();
	}
}
