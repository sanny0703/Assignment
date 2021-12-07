package assignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Reassemble {

	public static String assemble(String[] s) {
		
		StringBuilder str = new StringBuilder();
		HashSet<Character>last = new HashSet<>();
		for(String a:s) {
			last.add(a.charAt(a.length()-1));
		}
		HashMap<Character,Integer>first = new HashMap<>();
		for(int i =0;i<s.length;i++) {
			if( !last.contains(s[i].charAt(0))) {
				str.append(s[i]);
			}
			else {
				first.put(s[i].charAt(0), i);
			}
			
			
		}
		while(first.containsKey(str.charAt(str.length()-1))) {
			int l = str.length()-1;
			str.append(s[first.get(str.charAt(str.length()-1))]);
			str.deleteCharAt(l);
		}
		return str.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String[] s= st.split(" ");
		System.out.println(assemble(s));
		sc.close();
	}
}
