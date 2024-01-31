package SearchingAlgorithms;

import java.util.*;
class Bubblesorting{
	public void Bubblesortmethod(int[] arr,int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1])
				{
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
	}
}
public class BubbleSort {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Before Sorting");
		for(int e:arr) {
			System.out.print(e+" ");
		}
		Bubblesorting bs=new Bubblesorting();
		bs.Bubblesortmethod(arr, n);
		System.out.println("After Sorting");
		for(int e:arr) {
			System.out.print(e+" ");
		}
		
	}
}
