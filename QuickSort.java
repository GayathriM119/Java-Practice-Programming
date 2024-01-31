package SearchingAlgorithms;

import java.util.*;
class Quicksorting{
	public int partition(int[] arr,int l,int h) {
		int i=l-1;
		int pivot=arr[h];
		for(int j=l;j<h;j++) {
			if(arr[j]<pivot) {
				i++;
				int t=arr[j];
				arr[j]=arr[i];
				arr[i]=t;
			}
		}
			int t=arr[i+1];
			arr[i+1]=arr[h];
			arr[h]=t;
			return i+1;
		}
	public void QuickSortMethod(int[] arr,int l,int h) {
		int pivot;
		if(l<h) {
			pivot=partition(arr,l,h);
			QuickSortMethod(arr,l,pivot-1);
			QuickSortMethod(arr,pivot+1,h);
		}
	}
}
public class QuickSort {
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
		Quicksorting qs=new Quicksorting();
		qs.QuickSortMethod(arr,0,n-1);
		System.out.println("After Sorting");
		for(int e:arr) {
			System.out.print(e+" ");
		}
		System.out.println();
	}
}
