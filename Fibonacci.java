package PracticePrgms;
import java.util.*;
public class Fibonacci {
	public static void Fib(int n) {
		int a=0;
		int b=1;
		System.out.print(a+" ");
		for(int i=1;i<n;i++) {
			System.out.print(b+" ");
			int temp=b;
			b=a+b;
			a=temp;
		}
	}
		public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Fib(n);
		}
}
