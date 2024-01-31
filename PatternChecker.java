package PracticePrgms;

import java.util.*;
import java.util.regex.*;
import java.util.regex.*;
public class PatternChecker
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
        while(n>0) {
			String s = sc.nextLine();
            try{
                Pattern.compile(s);
                System.out.println("Valid");
            }
            catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
            n--;
		}
	}
}



