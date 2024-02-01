package LinkedList;

public class LinkedList {
	Node head;
	LinkedList(){
		head=null;
	}
	LinkedList(Node h){
		head=h;
	}
	public boolean isEmpty() {
		if(head==null)
			return true;
		else
			return false;
	}
	public int insertAtFirst(int d) {
		Node node=new Node();
		node.data=d;
		node.next=null;
		if(isEmpty()) {
			head=node;
		}
		else {
			Node n=head;
			head=node;
			node.next=n;
		}
		return 1;
	}
	public int insertAtLast(int d) {
		Node node=new Node();
		node.data=d;
		node.next=null;
		if(head==null) {
			head=node;
		}
		else {
			Node n=new Node();
			n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
		return 1;
	}
	public int findSize() {
		if(isEmpty()) {
			return 0;
		}
		else {
			int c=1;
			Node t=new Node();
			t=head;
			while(t.next!=null) {
				t=t.next;
				c++;
			}
			return c;
		}
	}
	public int insertAtPos(int d, int pos) {
		Node node=new Node();
		node.data=d;
		node.next=null;
		if(pos==1)
			insertAtFirst(d);
		else if(pos==findSize())
			insertAtLast(d);
		else {
			Node node2=new Node();
			node2=head;
			for(int i=1;i<pos-1;i++) {
				node2=node2.next;
			}
			node.next=node2.next;
			node2.next=node;
		}
		return 1;
	}
	public void deleteAtFirst() {
		if(isEmpty()) {
			System.out.println("can't delete!!! List is already empty!");
		}
		else
		{
			head=head.next;
			System.out.println("Item deleted Successfully!!!");
		}
	}
	public void deleteAtLast() {
		if(isEmpty()) {
			System.out.println("can't delete!!! List is already empty!");
		}
		else
		{
			Node node3=head;
			int no=findSize();
			for(int i=1;i<no-1;i++) {
				node3=node3.next;
			}
			node3.next=null;
			
		
			System.out.println("Item deleted Successfully!!!");
		}
	}
	public void deleteAtPos(int pos) {
		if(isEmpty())
			System.out.println("The list is already empty!!!");
		else {
			if(pos==1)
				deleteAtFirst();
			else if(pos==findSize())
				deleteAtLast();
			else {
				Node node4=head;
				for(int i=1;i<pos-1;i++) {
					node4=node4.next;
				}
				node4.next=node4.next.next;
							
			}
		}
	}
	public void showDetails() {
		Node t=new Node();
		t=head;
		while(t.next!=null) {
			System.out.print(t.data+" ");
			t=t.next;
		}
		System.out.println(t.data);
	}
}
