package PracticePrgms;
import java.util.*;
public class CrossPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j)
					System.out.print(count);
				else if(i+j==n+1) {
					System.out.print(count);
					
				}
				else
					System.out.print(" ");
			}
			count++;
			System.out.println();
		}
	}
}
