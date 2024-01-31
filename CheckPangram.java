package PracticePrgms;

import java.util.*;
import java.lang.*;
import java.io.*;
public class CheckPangram{
	public static void main(String[] args) {
    String s;
    Scanner sc=new Scanner(System.in);
    s=sc.next();
    char[] arr=s.toCharArray();
    int[] flag=new int[26];
    int index;
    for(int i=0;i<s.length();i++){
        if(arr[i]>='A'&&arr[i]<='Z')
        index=arr[i]-'A';
        else if(arr[i]>='a'&&arr[i]<='z')
        index=arr[i]-'a';
        else
        continue;
        flag[index]=1;
    }
    int c=0;
    for(int i=0;i<26;i++){
        if(flag[i]==0)
        c++;
    }
    if(c==0)
    System.out.println("Pangram");
    else
    System.out.println("Not a Pangram");
}
}
