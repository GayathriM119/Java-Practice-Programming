package SearchingAlgorithms;

import java.util.*;
class Selectionsorting{
	public void SelectionSortMethod(int[] arr,int n) {
		int minIndex;
		for(int i=0;i<n;i++) {
			minIndex=i;
			for(int j=i+1;j<n;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex=j;
				}
			}
			int t=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=t;
		}
	}
}
public class SelectionSort {
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
		Selectionsorting ss=new Selectionsorting();
		ss.SelectionSortMethod(arr, n);
		System.out.println("After Sorting");
		for(int e:arr) {
			System.out.print(e+" ");
		}
		System.out.println();
	}
}
