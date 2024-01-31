package PracticePrgms;
import java.util.*;
public class Pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count;
		for(int i=1;i<=n;i++) {
			count=1;
			for(int k=i;k<n;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(count++);
			}
			for(int l=2;l<=i;l++) {
				System.out.print(count++);
			}
			System.out.println();
		}
		
	}
}
