package PracticePrgms;
import java.util.*;
import java.lang.*;
import java.io.*;
public class FormString{
	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		String ans="";
		HashMap<Character, Integer> hashmap=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(Character.isAlphabetic(s.charAt(i))){
				char currentChar=s.charAt(i);
				int count=0;
				i++;
				while(i<s.length()&&Character.isDigit(s.charAt(i))) {
					count=count*10+Character.getNumericValue(s.charAt(i));
					i++;
				}
				hashmap.put(currentChar, count);
				i--;
			}
		}
		for(char k:hashmap.keySet()) {
			for(int j=0;j<hashmap.get(k);j++) {
				ans=ans+k;
			}
		}
		System.out.println("The original array is "+ans);
	}
}