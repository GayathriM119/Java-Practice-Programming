package PracticePrgms;
import java.util.*;
import java.lang.*;
import java.io.*;
public class ReverseString{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String input1=sc.nextLine();
    StringBuilder s=new StringBuilder();
    s.append(input1);
    s.reverse();
    System.out.println(s.toString());
}
}