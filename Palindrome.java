package PracticePrgms;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Palindrome {
	public static int checkPalindrome(String s) {
		int flag;
		String rev1="";
		char[] arr=s.toCharArray();
		Character[] reverse=new Character[100];
		int left=0;
		int right=s.length()-1;
		char temp;
		while(left<right) {
			temp=arr[left];
			reverse[left++]=arr[right];
			reverse[right--]=temp;
		}
		for(int i=0;i<s.length();i++)
		{
			rev1+=reverse[i];
		}
		System.out.println("The reversed String is "+rev1);
		if(rev1.equals(s))
			flag=0;
		else
			flag=1;
		return flag;
	}
	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		int ans=checkPalindrome(s);
		if(ans==0)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		rev(s);
	}
	public static void rev(String s) {
		StringBuilder sb=new StringBuilder();
		sb.append(s);
		sb.reverse();
		String r=sb.toString();
		System.out.println("The reversed String of "+s+" is : "+r);
		System.out.println(r.equals(s));
	}
}
