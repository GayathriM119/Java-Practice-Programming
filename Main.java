package LinkedList;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		Scanner sc=new Scanner(System.in);
		int ch,ele;
		do {
			System.out.println("Enter the choice\n1. Find size of the list.\n2. To insert element at the First.\n3. To insert element at the Last.\n4. To insert element at the given position.\n5. To delete at first.\n6. To delete at last.\n7. To delete the element at the given position.\n8. To display the elements");
			ch=sc.nextInt();
			switch(ch){
			case 1:
			{
				int n=list.findSize();
				System.out.println("The size of the given list is : "+n);
			}
			break;
			case 2:
			{
				ele=sc.nextInt();
				list.insertAtFirst(ele);
			}
			break;
			case 3:
			{
				ele=sc.nextInt();
				list.insertAtLast(ele);
			}
			break;
			case 4:
			{
				int pos;
				System.out.println("Enter the position where the element to be inserted.\n");
				pos=sc.nextInt();
				System.out.println("Enter the element to be inserted at the given position");
				ele=sc.nextInt();
				list.insertAtPos(ele, pos);
			}
			break;
			case 5:
			{
				list.deleteAtFirst();
			}
			break;
			case 6:
			{
				list.deleteAtLast();
			}
			break;
			case 7:{
				System.out.println("Enter the position where the element to be deleted.\n");
				int p=sc.nextInt();
				list.deleteAtPos(p);
			}
			break;
			case 8:
			  list.showDetails();
			  break;
			}
		}while(ch<9);
	}
}
