package PracticePrgms;
import java.util.*;
import java.lang.*;
import java.io.*;
public class FreqOfChar {
	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		HashMap<Character,Integer> hashmap=new HashMap<>();
		char[] arr=s.toCharArray();
		Arrays.sort(arr);
		for(char c:arr) {
			hashmap.put(c, hashmap.getOrDefault(c, 0)+1);
		}
		for(char c:arr) {
			if(hashmap.get(c)!=0) {
				System.out.print(c);
				System.out.print(hashmap.get(c));
				hashmap.put(c, 0);
			}
		}
	}
}
