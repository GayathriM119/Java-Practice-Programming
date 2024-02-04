package PracticePrgms;
import java.util.*;
public class TrapRainWater {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of walls");
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the heights of the walls");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();  
		
		
		
		int[] leftMax=new int[n];
		int[] rightMax=new int[n];
		leftMax[0]=arr[0];
		for(int i=1;i<n;i++) {
			leftMax[i]=Math.max(leftMax[i-1], arr[i]);
		}
		rightMax[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			rightMax[i]=Math.max(rightMax[i+1], arr[i]);
		}
		int sum=0;
	
		for(int i=0;i<n;i++) {
		int min1=Math.min(leftMax[i], rightMax[i]);
		sum=sum+(min1-arr[i]);
		}
		System.out.println(sum);
	}
}
