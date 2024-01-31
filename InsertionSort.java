package SearchingAlgorithms;

import java.util.*;
class Insertionsorting{
	public void InsertionSortMethod(int[] arr,int n) {
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
}
public class InsertionSort {
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
		System.out.println();
		Insertionsorting ss=new Insertionsorting();
		ss.InsertionSortMethod(arr, n);
		System.out.println("After Sorting");
		for(int e:arr) {
			System.out.print(e+" ");
		}
		System.out.println();
	}
}
