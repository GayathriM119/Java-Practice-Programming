package PracticePrgms;

import java.util.*;
import java.lang.*;
import java.io.*;
public class RevStringManual{
  public static String ReverseString(String s){
    Character[] result=new Character[100];
    int left=0;
    int right=s.length()-1;
    char temp;
    String r="";
    char[] arr=s.toCharArray();
    while(left<right){
      temp=arr[left];
      result[left++]=arr[right];
      result[right--]=temp;
     }
     for(int i=0;i<s.length();i++){
         r=r+String.valueOf(result[i]);
     }
     return r;
}
  public static void main(String[] args){
    String s;
    Scanner sc=new Scanner(System.in);
    s=sc.nextLine();
    String r=ReverseString(s);
    System.out.println(r);
  }
}
    