package PracticePrgms;
import java.util.*;
import java.lang.*;
import java.io.*;
public class PhoneNum{
    public static void main(String[] args){
        String phno="";
        Stack<Character> s=new Stack<Character>();
        char KeyPress;
        Scanner sc=new Scanner(System.in);
        while(phno.length()<10){
        	KeyPress=sc.next().charAt(0);
            if(Character.isDigit(KeyPress)){
                s.push(KeyPress);
                char c=s.peek();
                phno=phno+c;
            }
            else if(KeyPress=='x'&&(!s.empty())){
                s.pop();
                phno=phno.substring(0,phno.length()-1);
            }
            else{
                System.out.println("INVALID");
            }
            System.out.println("The Phone No is : "+phno);
        }
    }
}