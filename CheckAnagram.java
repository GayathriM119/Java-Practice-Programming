package PracticePrgms;
import java.util.Scanner;

public class CheckAnagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int check1=1;
        int check2=1;
        a=a.toLowerCase();
        b=b.toLowerCase();
        for(int i=0;i<a.length();i++){
            check1=check1*a.charAt(i);
        }
        for(int i=0;i<b.length();i++){
            check2=check2*b.charAt(i);
        }
        System.out.println(check1);
        System.out.println(check2);
        if(check1==check2)
        return true;
        else
        return false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}