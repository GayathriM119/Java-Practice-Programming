package SearchingAlgorithms;
import java.util.*;
class BinarySearchMethod {
	public int BinarySearchAlgorithm(ArrayList<Integer> arr,int target,int left,int right) {
		int mid,r=1000;
		arr.sort(null);
		System.out.println(arr);
		if(left<=right) {
			mid=(left+right)/2;
			//System.out.println(mid);
			if(arr.get(mid)==target)
				r=mid;
			else if(arr.get(mid)<target)
				r=BinarySearchAlgorithm(arr,target,left,mid);
			else
				r=BinarySearchAlgorithm(arr,target,mid+1,right);
		}
		return r;
	}
}
public class BinarySearch{
	public static void main(String[] args) {
		int n,ele,target;
		System.out.println("Enter the number of elements: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>(n);
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++) {
			ele=sc.nextInt();
			arr.add(ele);
		}
		System.out.println("Enter the target element to be searched: ");
		target=sc.nextInt();
		BinarySearchMethod bsm1=new BinarySearchMethod();
		int r=bsm1.BinarySearchAlgorithm(arr,target,0,arr.size()-1);
		System.out.println("The result is: "+r);
	}
}
