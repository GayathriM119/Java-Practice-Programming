package SearchingAlgorithms;
import java.util.*;
class LinearSearchMethod {
	public int LinearSearchAlgorithm(ArrayList<Integer> arr,int target) {
		arr.sort(null);
		System.out.println(arr);
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)==target)
				return i;
		}
		return -1;
		
	}
}
public class LinearSearch{
	public static void main(String[] args) {
		int n,ele;
		System.out.println("Enter the number of elements:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the elements:");
		ArrayList<Integer> arr=new ArrayList<Integer>(n);
		for(int i=0;i<n;i++) {
			ele=sc.nextInt();
			arr.add(ele);
		}
		System.out.println("Enter the target element to be searched: ");
		int target=sc.nextInt();
		LinearSearchMethod lsm1=new LinearSearchMethod();
		int r=lsm1.LinearSearchAlgorithm(arr, target);
		System.out.println("The result is : "+r);
	}
}