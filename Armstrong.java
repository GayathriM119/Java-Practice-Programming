package PracticePrgms;
import java.util.*;
public class Armstrong {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int c=0;
		int n1=n;
		int n2=n;
		while(n1>0) {
			int rem=n1%10;
			c++;
			n1=n1/10;
		}
		int sum=0;
		while(n2>0) {
			int rem=n2%10;
			sum=(int) (sum+Math.pow(rem,c));
			n2=n2/10;
		}
		if(sum==n)
		System.out.println("The given no is an Armstrong no");
		else
		System.out.println("The given no is not an Armstrong no");
	}
}
