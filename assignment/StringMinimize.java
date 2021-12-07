package assignment;

import java.util.Scanner;

public class StringMinimize {

	public static int minimize(String s) {
		int i =0;int j=s.length()-1;
		while(i<=j && s.charAt(i)==s.charAt(j)) {
			char d = s.charAt(i);
			while(i<=j && s.charAt(i)==d) {
				i++;
			}
			while(i<=j && s.charAt(j)==d) {
				j--;
				
			}
			
		}
		return j-i+1;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur String: ");
		String s = sc.next();
		System.out.println(minimize(s));
		sc.close();
	}
}
